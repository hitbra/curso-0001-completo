/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package br.com.hitbra.marketplace.avro.offers;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Offer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Offer\",\"namespace\":\"br.com.hitbra.marketplace.avro.offers\",\"fields\":[{\"name\":\"offer_id\",\"type\":\"long\"},{\"name\":\"active\",\"type\":\"boolean\"},{\"name\":\"deleted\",\"type\":\"boolean\"},{\"name\":\"shop_id\",\"type\":\"long\"},{\"name\":\"product_sku\",\"type\":\"string\"},{\"name\":\"shop_sku\",\"type\":\"string\"},{\"name\":\"price\",\"type\":{\"type\":\"record\",\"name\":\"OfferPriceDecimal\",\"fields\":[{\"name\":\"precision\",\"type\":\"long\"},{\"name\":\"scale\",\"type\":\"long\"}]}},{\"name\":\"origin_price\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"OfferOriginPriceDecimal\",\"fields\":[{\"name\":\"precision\",\"type\":\"long\"},{\"name\":\"scale\",\"type\":\"long\"}]}]},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"leadtime_to_ship\",\"type\":\"int\"},{\"name\":\"discount_start_date\",\"type\":[\"long\",\"null\"],\"logicalType\":\"time-millis\"},{\"name\":\"discount_end_date\",\"type\":[\"long\",\"null\"],\"logicalType\":\"time-millis\"},{\"name\":\"available_start_date\",\"type\":[\"long\",\"null\"],\"logicalType\":\"time-millis\"},{\"name\":\"available_end_date\",\"type\":[\"long\",\"null\"],\"logicalType\":\"time-millis\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long offer_id;
  @Deprecated public boolean active;
  @Deprecated public boolean deleted;
  @Deprecated public long shop_id;
  @Deprecated public java.lang.CharSequence product_sku;
  @Deprecated public java.lang.CharSequence shop_sku;
  @Deprecated public br.com.hitbra.marketplace.avro.offers.OfferPriceDecimal price;
  @Deprecated public br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal origin_price;
  @Deprecated public int quantity;
  @Deprecated public int leadtime_to_ship;
  @Deprecated public java.lang.Long discount_start_date;
  @Deprecated public java.lang.Long discount_end_date;
  @Deprecated public java.lang.Long available_start_date;
  @Deprecated public java.lang.Long available_end_date;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Offer() {}

  /**
   * All-args constructor.
   */
  public Offer( java.lang.Long offer_id, java.lang.Boolean active, java.lang.Boolean deleted, java.lang.Long shop_id, java.lang.CharSequence product_sku, java.lang.CharSequence shop_sku, br.com.hitbra.marketplace.avro.offers.OfferPriceDecimal price, br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal origin_price, java.lang.Integer quantity, java.lang.Integer leadtime_to_ship, java.lang.Long discount_start_date, java.lang.Long discount_end_date, java.lang.Long available_start_date, java.lang.Long available_end_date) {
    this.offer_id = offer_id;
    this.active = active;
    this.deleted = deleted;
    this.shop_id = shop_id;
    this.product_sku = product_sku;
    this.shop_sku = shop_sku;
    this.price = price;
    this.origin_price = origin_price;
    this.quantity = quantity;
    this.leadtime_to_ship = leadtime_to_ship;
    this.discount_start_date = discount_start_date;
    this.discount_end_date = discount_end_date;
    this.available_start_date = available_start_date;
    this.available_end_date = available_end_date;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return offer_id;
    case 1: return active;
    case 2: return deleted;
    case 3: return shop_id;
    case 4: return product_sku;
    case 5: return shop_sku;
    case 6: return price;
    case 7: return origin_price;
    case 8: return quantity;
    case 9: return leadtime_to_ship;
    case 10: return discount_start_date;
    case 11: return discount_end_date;
    case 12: return available_start_date;
    case 13: return available_end_date;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: offer_id = (java.lang.Long)value$; break;
    case 1: active = (java.lang.Boolean)value$; break;
    case 2: deleted = (java.lang.Boolean)value$; break;
    case 3: shop_id = (java.lang.Long)value$; break;
    case 4: product_sku = (java.lang.CharSequence)value$; break;
    case 5: shop_sku = (java.lang.CharSequence)value$; break;
    case 6: price = (br.com.hitbra.marketplace.avro.offers.OfferPriceDecimal)value$; break;
    case 7: origin_price = (br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal)value$; break;
    case 8: quantity = (java.lang.Integer)value$; break;
    case 9: leadtime_to_ship = (java.lang.Integer)value$; break;
    case 10: discount_start_date = (java.lang.Long)value$; break;
    case 11: discount_end_date = (java.lang.Long)value$; break;
    case 12: available_start_date = (java.lang.Long)value$; break;
    case 13: available_end_date = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'active' field.
   */
  public java.lang.Boolean getActive() {
    return active;
  }

  /**
   * Sets the value of the 'active' field.
   * @param value the value to set.
   */
  public void setActive(java.lang.Boolean value) {
    this.active = value;
  }

  /**
   * Gets the value of the 'deleted' field.
   */
  public java.lang.Boolean getDeleted() {
    return deleted;
  }

  /**
   * Sets the value of the 'deleted' field.
   * @param value the value to set.
   */
  public void setDeleted(java.lang.Boolean value) {
    this.deleted = value;
  }

  /**
   * Gets the value of the 'shop_id' field.
   */
  public java.lang.Long getShopId() {
    return shop_id;
  }

  /**
   * Sets the value of the 'shop_id' field.
   * @param value the value to set.
   */
  public void setShopId(java.lang.Long value) {
    this.shop_id = value;
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
   * Gets the value of the 'shop_sku' field.
   */
  public java.lang.CharSequence getShopSku() {
    return shop_sku;
  }

  /**
   * Sets the value of the 'shop_sku' field.
   * @param value the value to set.
   */
  public void setShopSku(java.lang.CharSequence value) {
    this.shop_sku = value;
  }

  /**
   * Gets the value of the 'price' field.
   */
  public br.com.hitbra.marketplace.avro.offers.OfferPriceDecimal getPrice() {
    return price;
  }

  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(br.com.hitbra.marketplace.avro.offers.OfferPriceDecimal value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'origin_price' field.
   */
  public br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal getOriginPrice() {
    return origin_price;
  }

  /**
   * Sets the value of the 'origin_price' field.
   * @param value the value to set.
   */
  public void setOriginPrice(br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal value) {
    this.origin_price = value;
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
   * Gets the value of the 'leadtime_to_ship' field.
   */
  public java.lang.Integer getLeadtimeToShip() {
    return leadtime_to_ship;
  }

  /**
   * Sets the value of the 'leadtime_to_ship' field.
   * @param value the value to set.
   */
  public void setLeadtimeToShip(java.lang.Integer value) {
    this.leadtime_to_ship = value;
  }

  /**
   * Gets the value of the 'discount_start_date' field.
   */
  public java.lang.Long getDiscountStartDate() {
    return discount_start_date;
  }

  /**
   * Sets the value of the 'discount_start_date' field.
   * @param value the value to set.
   */
  public void setDiscountStartDate(java.lang.Long value) {
    this.discount_start_date = value;
  }

  /**
   * Gets the value of the 'discount_end_date' field.
   */
  public java.lang.Long getDiscountEndDate() {
    return discount_end_date;
  }

  /**
   * Sets the value of the 'discount_end_date' field.
   * @param value the value to set.
   */
  public void setDiscountEndDate(java.lang.Long value) {
    this.discount_end_date = value;
  }

  /**
   * Gets the value of the 'available_start_date' field.
   */
  public java.lang.Long getAvailableStartDate() {
    return available_start_date;
  }

  /**
   * Sets the value of the 'available_start_date' field.
   * @param value the value to set.
   */
  public void setAvailableStartDate(java.lang.Long value) {
    this.available_start_date = value;
  }

  /**
   * Gets the value of the 'available_end_date' field.
   */
  public java.lang.Long getAvailableEndDate() {
    return available_end_date;
  }

  /**
   * Sets the value of the 'available_end_date' field.
   * @param value the value to set.
   */
  public void setAvailableEndDate(java.lang.Long value) {
    this.available_end_date = value;
  }

  /** Creates a new Offer RecordBuilder */
  public static br.com.hitbra.marketplace.avro.offers.Offer.Builder newBuilder() {
    return new br.com.hitbra.marketplace.avro.offers.Offer.Builder();
  }
  
  /** Creates a new Offer RecordBuilder by copying an existing Builder */
  public static br.com.hitbra.marketplace.avro.offers.Offer.Builder newBuilder( br.com.hitbra.marketplace.avro.offers.Offer.Builder other) {
    return new br.com.hitbra.marketplace.avro.offers.Offer.Builder(other);
  }
  
  /** Creates a new Offer RecordBuilder by copying an existing Offer instance */
  public static br.com.hitbra.marketplace.avro.offers.Offer.Builder newBuilder( br.com.hitbra.marketplace.avro.offers.Offer other) {
    return new br.com.hitbra.marketplace.avro.offers.Offer.Builder(other);
  }
  
  /**
   * RecordBuilder for Offer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Offer>
    implements org.apache.avro.data.RecordBuilder<Offer> {

    private long offer_id;
    private boolean active;
    private boolean deleted;
    private long shop_id;
    private java.lang.CharSequence product_sku;
    private java.lang.CharSequence shop_sku;
    private br.com.hitbra.marketplace.avro.offers.OfferPriceDecimal price;
    private br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal origin_price;
    private int quantity;
    private int leadtime_to_ship;
    private java.lang.Long discount_start_date;
    private java.lang.Long discount_end_date;
    private java.lang.Long available_start_date;
    private java.lang.Long available_end_date;

    /** Creates a new Builder */
    private Builder() {
      super(br.com.hitbra.marketplace.avro.offers.Offer.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(br.com.hitbra.marketplace.avro.offers.Offer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.offer_id)) {
        this.offer_id = data().deepCopy(fields()[0].schema(), other.offer_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.active)) {
        this.active = data().deepCopy(fields()[1].schema(), other.active);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.deleted)) {
        this.deleted = data().deepCopy(fields()[2].schema(), other.deleted);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.shop_id)) {
        this.shop_id = data().deepCopy(fields()[3].schema(), other.shop_id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.product_sku)) {
        this.product_sku = data().deepCopy(fields()[4].schema(), other.product_sku);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.shop_sku)) {
        this.shop_sku = data().deepCopy(fields()[5].schema(), other.shop_sku);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.price)) {
        this.price = data().deepCopy(fields()[6].schema(), other.price);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.origin_price)) {
        this.origin_price = data().deepCopy(fields()[7].schema(), other.origin_price);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.quantity)) {
        this.quantity = data().deepCopy(fields()[8].schema(), other.quantity);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.leadtime_to_ship)) {
        this.leadtime_to_ship = data().deepCopy(fields()[9].schema(), other.leadtime_to_ship);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.discount_start_date)) {
        this.discount_start_date = data().deepCopy(fields()[10].schema(), other.discount_start_date);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.discount_end_date)) {
        this.discount_end_date = data().deepCopy(fields()[11].schema(), other.discount_end_date);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.available_start_date)) {
        this.available_start_date = data().deepCopy(fields()[12].schema(), other.available_start_date);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.available_end_date)) {
        this.available_end_date = data().deepCopy(fields()[13].schema(), other.available_end_date);
        fieldSetFlags()[13] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Offer instance */
    private Builder(br.com.hitbra.marketplace.avro.offers.Offer other) {
            super(br.com.hitbra.marketplace.avro.offers.Offer.SCHEMA$);
      if (isValidValue(fields()[0], other.offer_id)) {
        this.offer_id = data().deepCopy(fields()[0].schema(), other.offer_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.active)) {
        this.active = data().deepCopy(fields()[1].schema(), other.active);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.deleted)) {
        this.deleted = data().deepCopy(fields()[2].schema(), other.deleted);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.shop_id)) {
        this.shop_id = data().deepCopy(fields()[3].schema(), other.shop_id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.product_sku)) {
        this.product_sku = data().deepCopy(fields()[4].schema(), other.product_sku);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.shop_sku)) {
        this.shop_sku = data().deepCopy(fields()[5].schema(), other.shop_sku);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.price)) {
        this.price = data().deepCopy(fields()[6].schema(), other.price);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.origin_price)) {
        this.origin_price = data().deepCopy(fields()[7].schema(), other.origin_price);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.quantity)) {
        this.quantity = data().deepCopy(fields()[8].schema(), other.quantity);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.leadtime_to_ship)) {
        this.leadtime_to_ship = data().deepCopy(fields()[9].schema(), other.leadtime_to_ship);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.discount_start_date)) {
        this.discount_start_date = data().deepCopy(fields()[10].schema(), other.discount_start_date);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.discount_end_date)) {
        this.discount_end_date = data().deepCopy(fields()[11].schema(), other.discount_end_date);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.available_start_date)) {
        this.available_start_date = data().deepCopy(fields()[12].schema(), other.available_start_date);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.available_end_date)) {
        this.available_end_date = data().deepCopy(fields()[13].schema(), other.available_end_date);
        fieldSetFlags()[13] = true;
      }
    }

    /** Gets the value of the 'offer_id' field */
    public java.lang.Long getOfferId() {
      return offer_id;
    }
    
    /** Sets the value of the 'offer_id' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setOfferId( long value) {
      validate(fields()[0], value);
      this.offer_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'offer_id' field has been set */
    public boolean hasOfferId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'offer_id' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearOfferId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'active' field */
    public java.lang.Boolean getActive() {
      return active;
    }
    
    /** Sets the value of the 'active' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setActive( boolean value) {
      validate(fields()[1], value);
      this.active = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'active' field has been set */
    public boolean hasActive() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'active' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearActive() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'deleted' field */
    public java.lang.Boolean getDeleted() {
      return deleted;
    }
    
    /** Sets the value of the 'deleted' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setDeleted( boolean value) {
      validate(fields()[2], value);
      this.deleted = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'deleted' field has been set */
    public boolean hasDeleted() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'deleted' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearDeleted() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'shop_id' field */
    public java.lang.Long getShopId() {
      return shop_id;
    }
    
    /** Sets the value of the 'shop_id' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setShopId( long value) {
      validate(fields()[3], value);
      this.shop_id = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'shop_id' field has been set */
    public boolean hasShopId() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'shop_id' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearShopId() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'product_sku' field */
    public java.lang.CharSequence getProductSku() {
      return product_sku;
    }
    
    /** Sets the value of the 'product_sku' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setProductSku( java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.product_sku = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'product_sku' field has been set */
    public boolean hasProductSku() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'product_sku' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearProductSku() {
      product_sku = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'shop_sku' field */
    public java.lang.CharSequence getShopSku() {
      return shop_sku;
    }
    
    /** Sets the value of the 'shop_sku' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setShopSku( java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.shop_sku = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'shop_sku' field has been set */
    public boolean hasShopSku() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'shop_sku' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearShopSku() {
      shop_sku = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'price' field */
    public br.com.hitbra.marketplace.avro.offers.OfferPriceDecimal getPrice() {
      return price;
    }
    
    /** Sets the value of the 'price' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setPrice( br.com.hitbra.marketplace.avro.offers.OfferPriceDecimal value) {
      validate(fields()[6], value);
      this.price = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'price' field has been set */
    public boolean hasPrice() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'price' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearPrice() {
      price = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'origin_price' field */
    public br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal getOriginPrice() {
      return origin_price;
    }
    
    /** Sets the value of the 'origin_price' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setOriginPrice( br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal value) {
      validate(fields()[7], value);
      this.origin_price = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'origin_price' field has been set */
    public boolean hasOriginPrice() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'origin_price' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearOriginPrice() {
      origin_price = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'quantity' field */
    public java.lang.Integer getQuantity() {
      return quantity;
    }
    
    /** Sets the value of the 'quantity' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setQuantity( int value) {
      validate(fields()[8], value);
      this.quantity = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'quantity' field has been set */
    public boolean hasQuantity() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'quantity' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearQuantity() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'leadtime_to_ship' field */
    public java.lang.Integer getLeadtimeToShip() {
      return leadtime_to_ship;
    }
    
    /** Sets the value of the 'leadtime_to_ship' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setLeadtimeToShip( int value) {
      validate(fields()[9], value);
      this.leadtime_to_ship = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'leadtime_to_ship' field has been set */
    public boolean hasLeadtimeToShip() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'leadtime_to_ship' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearLeadtimeToShip() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'discount_start_date' field */
    public java.lang.Long getDiscountStartDate() {
      return discount_start_date;
    }
    
    /** Sets the value of the 'discount_start_date' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setDiscountStartDate( java.lang.Long value) {
      validate(fields()[10], value);
      this.discount_start_date = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'discount_start_date' field has been set */
    public boolean hasDiscountStartDate() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'discount_start_date' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearDiscountStartDate() {
      discount_start_date = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'discount_end_date' field */
    public java.lang.Long getDiscountEndDate() {
      return discount_end_date;
    }
    
    /** Sets the value of the 'discount_end_date' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setDiscountEndDate( java.lang.Long value) {
      validate(fields()[11], value);
      this.discount_end_date = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'discount_end_date' field has been set */
    public boolean hasDiscountEndDate() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'discount_end_date' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearDiscountEndDate() {
      discount_end_date = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'available_start_date' field */
    public java.lang.Long getAvailableStartDate() {
      return available_start_date;
    }
    
    /** Sets the value of the 'available_start_date' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setAvailableStartDate( java.lang.Long value) {
      validate(fields()[12], value);
      this.available_start_date = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'available_start_date' field has been set */
    public boolean hasAvailableStartDate() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'available_start_date' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearAvailableStartDate() {
      available_start_date = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /** Gets the value of the 'available_end_date' field */
    public java.lang.Long getAvailableEndDate() {
      return available_end_date;
    }
    
    /** Sets the value of the 'available_end_date' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder setAvailableEndDate( java.lang.Long value) {
      validate(fields()[13], value);
      this.available_end_date = value;
      fieldSetFlags()[13] = true;
      return this; 
    }
    
    /** Checks whether the 'available_end_date' field has been set */
    public boolean hasAvailableEndDate() {
      return fieldSetFlags()[13];
    }
    
    /** Clears the value of the 'available_end_date' field */
    public br.com.hitbra.marketplace.avro.offers.Offer.Builder clearAvailableEndDate() {
      available_end_date = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    @Override
    public Offer build() {
      try {
        Offer record = new Offer();
        record.offer_id = fieldSetFlags()[0] ? this.offer_id : (java.lang.Long) defaultValue(fields()[0]);
        record.active = fieldSetFlags()[1] ? this.active : (java.lang.Boolean) defaultValue(fields()[1]);
        record.deleted = fieldSetFlags()[2] ? this.deleted : (java.lang.Boolean) defaultValue(fields()[2]);
        record.shop_id = fieldSetFlags()[3] ? this.shop_id : (java.lang.Long) defaultValue(fields()[3]);
        record.product_sku = fieldSetFlags()[4] ? this.product_sku : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.shop_sku = fieldSetFlags()[5] ? this.shop_sku : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.price = fieldSetFlags()[6] ? this.price : (br.com.hitbra.marketplace.avro.offers.OfferPriceDecimal) defaultValue(fields()[6]);
        record.origin_price = fieldSetFlags()[7] ? this.origin_price : (br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal) defaultValue(fields()[7]);
        record.quantity = fieldSetFlags()[8] ? this.quantity : (java.lang.Integer) defaultValue(fields()[8]);
        record.leadtime_to_ship = fieldSetFlags()[9] ? this.leadtime_to_ship : (java.lang.Integer) defaultValue(fields()[9]);
        record.discount_start_date = fieldSetFlags()[10] ? this.discount_start_date : (java.lang.Long) defaultValue(fields()[10]);
        record.discount_end_date = fieldSetFlags()[11] ? this.discount_end_date : (java.lang.Long) defaultValue(fields()[11]);
        record.available_start_date = fieldSetFlags()[12] ? this.available_start_date : (java.lang.Long) defaultValue(fields()[12]);
        record.available_end_date = fieldSetFlags()[13] ? this.available_end_date : (java.lang.Long) defaultValue(fields()[13]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}