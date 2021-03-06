/*
 * This file is generated by jOOQ.
*/
package cn.emac.demo.petstore.domain.tables.daos;


import cn.emac.demo.petstore.domain.tables.Sequence;
import cn.emac.demo.petstore.domain.tables.records.SequenceRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Inventory
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class SequenceDao extends DAOImpl<SequenceRecord, cn.emac.demo.petstore.domain.tables.pojos.Sequence, String> {

    /**
     * Create a new SequenceDao without any configuration
     */
    public SequenceDao() {
        super(Sequence.SEQUENCE, cn.emac.demo.petstore.domain.tables.pojos.Sequence.class);
    }

    /**
     * Create a new SequenceDao with an attached configuration
     */
    @Autowired
    public SequenceDao(Configuration configuration) {
        super(Sequence.SEQUENCE, cn.emac.demo.petstore.domain.tables.pojos.Sequence.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.emac.demo.petstore.domain.tables.pojos.Sequence object) {
        return object.getName();
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<cn.emac.demo.petstore.domain.tables.pojos.Sequence> fetchByName(String... values) {
        return fetch(Sequence.SEQUENCE.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>name = value</code>
     */
    public cn.emac.demo.petstore.domain.tables.pojos.Sequence fetchOneByName(String value) {
        return fetchOne(Sequence.SEQUENCE.NAME, value);
    }

    /**
     * Fetch records that have <code>nextid IN (values)</code>
     */
    public List<cn.emac.demo.petstore.domain.tables.pojos.Sequence> fetchByNextid(Integer... values) {
        return fetch(Sequence.SEQUENCE.NEXTID, values);
    }
}
