/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package br.com.hitbra.marketplace.avro.orders;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OrderLine extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderLine\",\"namespace\":\"br.com.hitbra.marketplace.avro.orders\",\"fields\":[{\"name\":\"order_line_id\",\"type\":\"string\"},{\"name\":\"order_line_state\",\"type\":\"string\"},{\"name\":\"product_sku\",\"type\":\"string\"},{\"name\":\"offer_id\",\"type\":\"long\"},{\"name\":\"offer_sku\",\"type\":\"string\"},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"received_date\",\"type\":[\"long\",\"null\"],\"logicalType\":\"time-millis\"},{\"name\":\"shipped_date\",\"type\":[\"long\",\"null\"],\"logicalType\":\"time-millis\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence order_line_id;
  @Deprecated public java.lang.CharSequence order_line_state;
  @Deprecated public java.lang.CharSequence product_sku;
  @Deprecated public long offer_id;
  @Deprecated public java.lang.CharSequence offer_sku;
  @Deprecated public int quantity;
  @Deprecated public java.lang.Long received_date;
  @Deprecated public java.lang.Long shipped_date;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public OrderLine() {}

  /**
   * All-args constructor.
   */
  public OrderLine(java.lang.CharSequence order_line_id, java.lang.CharSequence order_line_state, java.lang.CharSequence product_sku, java.lang.Long offer_id, java.lang.CharSequence offer_sku, java.lang.Integer quantity, java.lang.Long received_date, java.lang.Long shipped_date) {
    this.order_line_id = order_line_id;
    this.order_line_state = order_line_state;
    this.product_sku = product_sku;
    this.offer_id = offer_id;
    this.offer_sku = offer_sku;
    this.quantity = quantity;
    this.received_date = received_date;
    this.shipped_date = shipped_date;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return order_line_id;
    case 1: return order_line_state;
    case 2: return product_sku;
    case 3: return offer_id;
    case 4: return offer_sku;
    case 5: return quantity;
    case 6: return received_date;
    case 7: return shipped_date;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: order_line_id = (java.lang.CharSequence)value$; break;
    case 1: order_line_state = (java.lang.CharSequence)value$; break;
    case 2: product_sku = (java.lang.CharSequence)value$; break;
    case 3: offer_id = (java.lang.Long)value$; break;
    case 4: offer_sku = (java.lang.CharSequence)value$; break;
    case 5: quantity = (java.lang.Integer)value$; break;
    case 6: received_date = (java.lang.Long)value$; break;
    case 7: shipped_date = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'order_line_id' field.
   */
  public java.lang.CharSequence getOrderLineId() {
    return order_line_id;
  }

  /**
   * Sets the value of the 'order_line_id' field.
   * @param value the value to set.
   */
  public void setOrderLineId(java.lang.CharSequence value) {
    this.order_line_id = value;
  }

  /**
   * Gets the value of the 'order_line_state' field.
   */
  public java.lang.CharSequence getOrderLineState() {
    return order_line_state;
  }

  /**
   * Sets the value of the 'order_line_state' field.
   * @param value the value to set.
   */
  public void setOrderLineState(java.lang.CharSequence value) {
    this.order_line_state = value;
  }

  /**
   * Gets the value of the 'product_sku' field.
   */
  public java.lang.CharSequence getProductSku() {
    return product_sku;
  }

  /**
   * Sets the value of the 'product_sku' field.
   * @param value the value to set.
   */
  public void setProductSku(java.lang.CharSequence value) {
    this.product_sku = value;
  }

  /**
   * Gets the value of the 'offer_id' field.
   */
  public java.lang.Long getOfferId() {
    return offer_id;
  }

  /**
   * Sets the value of the 'offer_id' field.
   * @param value the value to set.
   */
  public void setOfferId(java.lang.Long value) {
    this.offer_id = value;
  }

  /**
   * Gets the value of the 'offer_sku' field.
   */
  public java.lang.CharSequence getOfferSku() {
    return offer_sku;
  }

  /**
   * Sets the value of the 'offer_sku' field.
   * @param value the value to set.
   */
  public void setOfferSku(java.lang.CharSequence value) {
    this.offer_sku = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   */
  public java.lang.Integer getQuantity() {
    return quantity;
  }

  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(java.lang.Integer value) {
    this.quantity = value;
  }

  /**
   * Gets the value of the 'received_date' field.
   */
  public java.lang.Long getReceivedDate() {
    return received_date;
  }

  /**
   * Sets the value of the 'received_date' field.
   * @param value the value to set.
   */
  public void setReceivedDate(java.lang.Long value) {
    this.received_date = value;
  }

  /**
   * Gets the value of the 'shipped_date' field.
   */
  public java.lang.Long getShippedDate() {
    return shipped_date;
  }

  /**
   * Sets the value of the 'shipped_date' field.
   * @param value the value to set.
   */
  public void setShippedDate(java.lang.Long value) {
    this.shipped_date = value;
  }

  /** Creates a new OrderLine RecordBuilder */
  public static br.com.hitbra.marketplace.avro.orders.OrderLine.Builder newBuilder() {
    return new br.com.hitbra.marketplace.avro.orders.OrderLine.Builder();
  }
  
  /** Creates a new OrderLine RecordBuilder by copying an existing Builder */
  public static br.com.hitbra.marketplace.avro.orders.OrderLine.Builder newBuilder(br.com.hitbra.marketplace.avro.orders.OrderLine.Builder other) {
    return new br.com.hitbra.marketplace.avro.orders.OrderLine.Builder(other);
  }
  
  /** Creates a new OrderLine RecordBuilder by copying an existing OrderLine instance */
  public static br.com.hitbra.marketplace.avro.orders.OrderLine.Builder newBuilder(br.com.hitbra.marketplace.avro.orders.OrderLine other) {
    return new br.com.hitbra.marketplace.avro.orders.OrderLine.Builder(other);
  }
  
  /**
   * RecordBuilder for OrderLine instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderLine>
    implements org.apache.avro.data.RecordBuilder<OrderLine> {

    private java.lang.CharSequence order_line_id;
    private java.lang.CharSequence order_line_state;
    private java.lang.CharSequence product_sku;
    private long offer_id;
    private java.lang.CharSequence offer_sku;
    private int quantity;
    private java.lang.Long received_date;
    private java.lang.Long shipped_date;

    /** Creates a new Builder */
    private Builder() {
      super(br.com.hitbra.marketplace.avro.orders.OrderLine.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(br.com.hitbra.marketplace.avro.orders.OrderLine.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.order_line_id)) {
        this.order_line_id = data().deepCopy(fields()[0].schema(), other.order_line_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.order_line_state)) {
        this.order_line_state = data().deepCopy(fields()[1].schema(), other.order_line_state);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.product_sku)) {
        this.product_sku = data().deepCopy(fields()[2].schema(), other.product_sku);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.offer_id)) {
        this.offer_id = data().deepCopy(fields()[3].schema(), other.offer_id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.offer_sku)) {
        this.offer_sku = data().deepCopy(fields()[4].schema(), other.offer_sku);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.quantity)) {
        this.quantity = data().deepCopy(fields()[5].schema(), other.quantity);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.received_date)) {
        this.received_date = data().deepCopy(fields()[6].schema(), other.received_date);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.shipped_date)) {
        this.shipped_date = data().deepCopy(fields()[7].schema(), other.shipped_date);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing OrderLine instance */
    private Builder(br.com.hitbra.marketplace.avro.orders.OrderLine other) {
            super(br.com.hitbra.marketplace.avro.orders.OrderLine.SCHEMA$);
      if (isValidValue(fields()[0], other.order_line_id)) {
        this.order_line_id = data().deepCopy(fields()[0].schema(), other.order_line_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.order_line_state)) {
        this.order_line_state = data().deepCopy(fields()[1].schema(), other.order_line_state);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.product_sku)) {
        this.product_sku = data().deepCopy(fields()[2].schema(), other.product_sku);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.offer_id)) {
        this.offer_id = data().deepCopy(fields()[3].schema(), other.offer_id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.offer_sku)) {
        this.offer_sku = data().deepCopy(fields()[4].schema(), other.offer_sku);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.quantity)) {
        this.quantity = data().deepCopy(fields()[5].schema(), other.quantity);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.received_date)) {
        this.received_date = data().deepCopy(fields()[6].schema(), other.received_date);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.shipped_date)) {
        this.shipped_date = data().deepCopy(fields()[7].schema(), other.shipped_date);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'order_line_id' field */
    public java.lang.CharSequence getOrderLineId() {
      return order_line_id;
    }
    
    /** Sets the value of the 'order_line_id' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder setOrderLineId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.order_line_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'order_line_id' field has been set */
    public boolean hasOrderLineId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'order_line_id' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder clearOrderLineId() {
      order_line_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'order_line_state' field */
    public java.lang.CharSequence getOrderLineState() {
      return order_line_state;
    }
    
    /** Sets the value of the 'order_line_state' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder setOrderLineState(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.order_line_state = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'order_line_state' field has been set */
    public boolean hasOrderLineState() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'order_line_state' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder clearOrderLineState() {
      order_line_state = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'product_sku' field */
    public java.lang.CharSequence getProductSku() {
      return product_sku;
    }
    
    /** Sets the value of the 'product_sku' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder setProductSku(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.product_sku = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'product_sku' field has been set */
    public boolean hasProductSku() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'product_sku' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder clearProductSku() {
      product_sku = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'offer_id' field */
    public java.lang.Long getOfferId() {
      return offer_id;
    }
    
    /** Sets the value of the 'offer_id' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder setOfferId(long value) {
      validate(fields()[3], value);
      this.offer_id = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'offer_id' field has been set */
    public boolean hasOfferId() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'offer_id' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder clearOfferId() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'offer_sku' field */
    public java.lang.CharSequence getOfferSku() {
      return offer_sku;
    }
    
    /** Sets the value of the 'offer_sku' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder setOfferSku(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.offer_sku = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'offer_sku' field has been set */
    public boolean hasOfferSku() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'offer_sku' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder clearOfferSku() {
      offer_sku = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'quantity' field */
    public java.lang.Integer getQuantity() {
      return quantity;
    }
    
    /** Sets the value of the 'quantity' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder setQuantity(int value) {
      validate(fields()[5], value);
      this.quantity = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'quantity' field has been set */
    public boolean hasQuantity() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'quantity' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder clearQuantity() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'received_date' field */
    public java.lang.Long getReceivedDate() {
      return received_date;
    }
    
    /** Sets the value of the 'received_date' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder setReceivedDate(java.lang.Long value) {
      validate(fields()[6], value);
      this.received_date = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'received_date' field has been set */
    public boolean hasReceivedDate() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'received_date' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder clearReceivedDate() {
      received_date = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'shipped_date' field */
    public java.lang.Long getShippedDate() {
      return shipped_date;
    }
    
    /** Sets the value of the 'shipped_date' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder setShippedDate(java.lang.Long value) {
      validate(fields()[7], value);
      this.shipped_date = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'shipped_date' field has been set */
    public boolean hasShippedDate() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'shipped_date' field */
    public br.com.hitbra.marketplace.avro.orders.OrderLine.Builder clearShippedDate() {
      shipped_date = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public OrderLine build() {
      try {
        OrderLine record = new OrderLine();
        record.order_line_id = fieldSetFlags()[0] ? this.order_line_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.order_line_state = fieldSetFlags()[1] ? this.order_line_state : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.product_sku = fieldSetFlags()[2] ? this.product_sku : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.offer_id = fieldSetFlags()[3] ? this.offer_id : (java.lang.Long) defaultValue(fields()[3]);
        record.offer_sku = fieldSetFlags()[4] ? this.offer_sku : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.quantity = fieldSetFlags()[5] ? this.quantity : (java.lang.Integer) defaultValue(fields()[5]);
        record.received_date = fieldSetFlags()[6] ? this.received_date : (java.lang.Long) defaultValue(fields()[6]);
        record.shipped_date = fieldSetFlags()[7] ? this.shipped_date : (java.lang.Long) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
