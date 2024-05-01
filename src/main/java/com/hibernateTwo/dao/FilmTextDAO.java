package com.hibernateTwo.dao;

import com.hibernateTwo.domein.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDAO extends GenericDAO<FilmText> {
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class,sessionFactory);
    }
}
