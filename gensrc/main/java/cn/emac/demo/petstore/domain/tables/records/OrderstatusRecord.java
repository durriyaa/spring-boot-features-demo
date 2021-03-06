/*
 * This file is generated by jOOQ.
*/
package cn.emac.demo.petstore.domain.tables.records;


import cn.emac.demo.petstore.domain.tables.Orderstatus;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Status de pedidos
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderstatusRecord extends UpdatableRecordImpl<OrderstatusRecord> implements Record4<Integer, Integer, Date, String> {

    private static final long serialVersionUID = 1135762879;

    /**
     * Setter for <code>jpetstore.orderstatus.orderid</code>.
     */
    public OrderstatusRecord setOrderid(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jpetstore.orderstatus.orderid</code>.
     */
    public Integer getOrderid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jpetstore.orderstatus.linenum</code>.
     */
    public OrderstatusRecord setLinenum(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jpetstore.orderstatus.linenum</code>.
     */
    public Integer getLinenum() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jpetstore.orderstatus.timestamp</code>.
     */
    public OrderstatusRecord setTimestamp(Date value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jpetstore.orderstatus.timestamp</code>.
     */
    public Date getTimestamp() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>jpetstore.orderstatus.status</code>.
     */
    public OrderstatusRecord setStatus(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jpetstore.orderstatus.status</code>.
     */
    public String getStatus() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Date, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Date, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Orderstatus.ORDERSTATUS.ORDERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Orderstatus.ORDERSTATUS.LINENUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return Orderstatus.ORDERSTATUS.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Orderstatus.ORDERSTATUS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getOrderid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getLinenum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderstatusRecord value1(Integer value) {
        setOrderid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderstatusRecord value2(Integer value) {
        setLinenum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderstatusRecord value3(Date value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderstatusRecord value4(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderstatusRecord values(Integer value1, Integer value2, Date value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderstatusRecord
     */
    public OrderstatusRecord() {
        super(Orderstatus.ORDERSTATUS);
    }

    /**
     * Create a detached, initialised OrderstatusRecord
     */
    public OrderstatusRecord(Integer orderid, Integer linenum, Date timestamp, String status) {
        super(Orderstatus.ORDERSTATUS);

        set(0, orderid);
        set(1, linenum);
        set(2, timestamp);
        set(3, status);
    }
}
