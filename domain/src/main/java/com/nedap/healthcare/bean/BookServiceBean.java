package com.nedap.healthcare.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.nedap.healthcare.domain.Book;

@Stateless
public class BookServiceBean implements BookService {
    
	@PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
	public List<Book> list() {
    	return em.createQuery("from Book").getResultList();
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Book createOrUpdate(Book book) {
        return em.merge(book);
    }
    
    public void remove(Book book) {
        em.remove(em.merge(book));
    }
    
    public Book find(Long id) {
        return em.find(Book.class, id);
    }
}