/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package br.com.hitbra.marketplace.avro.offers;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OfferOriginPriceDecimal extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OfferOriginPriceDecimal\",\"namespace\":\"br.com.hitbra.marketplace.avro.offers\",\"fields\":[{\"name\":\"precision\",\"type\":\"long\"},{\"name\":\"scale\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long precision;
  @Deprecated public long scale;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public OfferOriginPriceDecimal() {}

  /**
   * All-args constructor.
   */
  public OfferOriginPriceDecimal(java.lang.Long precision, java.lang.Long scale) {
    this.precision = precision;
    this.scale = scale;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return precision;
    case 1: return scale;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: precision = (java.lang.Long)value$; break;
    case 1: scale = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'precision' field.
   */
  public java.lang.Long getPrecision() {
    return precision;
  }

  /**
   * Sets the value of the 'precision' field.
   * @param value the value to set.
   */
  public void setPrecision(java.lang.Long value) {
    this.precision = value;
  }

  /**
   * Gets the value of the 'scale' field.
   */
  public java.lang.Long getScale() {
    return scale;
  }

  /**
   * Sets the value of the 'scale' field.
   * @param value the value to set.
   */
  public void setScale(java.lang.Long value) {
    this.scale = value;
  }

  /** Creates a new OfferOriginPriceDecimal RecordBuilder */
  public static br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.Builder newBuilder() {
    return new br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.Builder();
  }
  
  /** Creates a new OfferOriginPriceDecimal RecordBuilder by copying an existing Builder */
  public static br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.Builder newBuilder( br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.Builder other) {
    return new br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.Builder(other);
  }
  
  /** Creates a new OfferOriginPriceDecimal RecordBuilder by copying an existing OfferOriginPriceDecimal instance */
  public static br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.Builder newBuilder( br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal other) {
    return new br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.Builder(other);
  }
  
  /**
   * RecordBuilder for OfferOriginPriceDecimal instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OfferOriginPriceDecimal>
    implements org.apache.avro.data.RecordBuilder<OfferOriginPriceDecimal> {

    private long precision;
    private long scale;

    /** Creates a new Builder */
    private Builder() {
      super(br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.precision)) {
        this.precision = data().deepCopy(fields()[0].schema(), other.precision);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.scale)) {
        this.scale = data().deepCopy(fields()[1].schema(), other.scale);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing OfferOriginPriceDecimal instance */
    private Builder(br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal other) {
            super(br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.SCHEMA$);
      if (isValidValue(fields()[0], other.precision)) {
        this.precision = data().deepCopy(fields()[0].schema(), other.precision);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.scale)) {
        this.scale = data().deepCopy(fields()[1].schema(), other.scale);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'precision' field */
    public java.lang.Long getPrecision() {
      return precision;
    }
    
    /** Sets the value of the 'precision' field */
    public br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.Builder setPrecision( long value) {
      validate(fields()[0], value);
      this.precision = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'precision' field has been set */
    public boolean hasPrecision() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'precision' field */
    public br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.Builder clearPrecision() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'scale' field */
    public java.lang.Long getScale() {
      return scale;
    }
    
    /** Sets the value of the 'scale' field */
    public br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.Builder setScale( long value) {
      validate(fields()[1], value);
      this.scale = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'scale' field has been set */
    public boolean hasScale() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'scale' field */
    public br.com.hitbra.marketplace.avro.offers.OfferOriginPriceDecimal.Builder clearScale() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public OfferOriginPriceDecimal build() {
      try {
        OfferOriginPriceDecimal record = new OfferOriginPriceDecimal();
        record.precision = fieldSetFlags()[0] ? this.precision : (java.lang.Long) defaultValue(fields()[0]);
        record.scale = fieldSetFlags()[1] ? this.scale : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}