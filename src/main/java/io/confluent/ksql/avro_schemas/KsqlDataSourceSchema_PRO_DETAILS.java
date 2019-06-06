/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package io.confluent.ksql.avro_schemas;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class KsqlDataSourceSchema_PRO_DETAILS extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KsqlDataSourceSchema_PRO_DETAILS\",\"namespace\":\"io.confluent.ksql.avro_schemas\",\"fields\":[{\"name\":\"CORPORATE_NAME\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"IDENTIFICATION_NUMBER\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"TAX_IDENTIFICATION_NUMBER\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence CORPORATE_NAME;
  @Deprecated public java.lang.CharSequence IDENTIFICATION_NUMBER;
  @Deprecated public java.lang.CharSequence TAX_IDENTIFICATION_NUMBER;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public KsqlDataSourceSchema_PRO_DETAILS() {}

  /**
   * All-args constructor.
   */
  public KsqlDataSourceSchema_PRO_DETAILS(java.lang.CharSequence CORPORATE_NAME, java.lang.CharSequence IDENTIFICATION_NUMBER, java.lang.CharSequence TAX_IDENTIFICATION_NUMBER) {
    this.CORPORATE_NAME = CORPORATE_NAME;
    this.IDENTIFICATION_NUMBER = IDENTIFICATION_NUMBER;
    this.TAX_IDENTIFICATION_NUMBER = TAX_IDENTIFICATION_NUMBER;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return CORPORATE_NAME;
    case 1: return IDENTIFICATION_NUMBER;
    case 2: return TAX_IDENTIFICATION_NUMBER;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: CORPORATE_NAME = (java.lang.CharSequence)value$; break;
    case 1: IDENTIFICATION_NUMBER = (java.lang.CharSequence)value$; break;
    case 2: TAX_IDENTIFICATION_NUMBER = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'CORPORATE_NAME' field.
   */
  public java.lang.CharSequence getCORPORATENAME() {
    return CORPORATE_NAME;
  }

  /**
   * Sets the value of the 'CORPORATE_NAME' field.
   * @param value the value to set.
   */
  public void setCORPORATENAME(java.lang.CharSequence value) {
    this.CORPORATE_NAME = value;
  }

  /**
   * Gets the value of the 'IDENTIFICATION_NUMBER' field.
   */
  public java.lang.CharSequence getIDENTIFICATIONNUMBER() {
    return IDENTIFICATION_NUMBER;
  }

  /**
   * Sets the value of the 'IDENTIFICATION_NUMBER' field.
   * @param value the value to set.
   */
  public void setIDENTIFICATIONNUMBER(java.lang.CharSequence value) {
    this.IDENTIFICATION_NUMBER = value;
  }

  /**
   * Gets the value of the 'TAX_IDENTIFICATION_NUMBER' field.
   */
  public java.lang.CharSequence getTAXIDENTIFICATIONNUMBER() {
    return TAX_IDENTIFICATION_NUMBER;
  }

  /**
   * Sets the value of the 'TAX_IDENTIFICATION_NUMBER' field.
   * @param value the value to set.
   */
  public void setTAXIDENTIFICATIONNUMBER(java.lang.CharSequence value) {
    this.TAX_IDENTIFICATION_NUMBER = value;
  }

  /** Creates a new KsqlDataSourceSchema_PRO_DETAILS RecordBuilder */
  public static io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder newBuilder() {
    return new io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder();
  }
  
  /** Creates a new KsqlDataSourceSchema_PRO_DETAILS RecordBuilder by copying an existing Builder */
  public static io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder newBuilder(io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder other) {
    return new io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder(other);
  }
  
  /** Creates a new KsqlDataSourceSchema_PRO_DETAILS RecordBuilder by copying an existing KsqlDataSourceSchema_PRO_DETAILS instance */
  public static io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder newBuilder(io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS other) {
    return new io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder(other);
  }
  
  /**
   * RecordBuilder for KsqlDataSourceSchema_PRO_DETAILS instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KsqlDataSourceSchema_PRO_DETAILS>
    implements org.apache.avro.data.RecordBuilder<KsqlDataSourceSchema_PRO_DETAILS> {

    private java.lang.CharSequence CORPORATE_NAME;
    private java.lang.CharSequence IDENTIFICATION_NUMBER;
    private java.lang.CharSequence TAX_IDENTIFICATION_NUMBER;

    /** Creates a new Builder */
    private Builder() {
      super(io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.CORPORATE_NAME)) {
        this.CORPORATE_NAME = data().deepCopy(fields()[0].schema(), other.CORPORATE_NAME);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.IDENTIFICATION_NUMBER)) {
        this.IDENTIFICATION_NUMBER = data().deepCopy(fields()[1].schema(), other.IDENTIFICATION_NUMBER);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.TAX_IDENTIFICATION_NUMBER)) {
        this.TAX_IDENTIFICATION_NUMBER = data().deepCopy(fields()[2].schema(), other.TAX_IDENTIFICATION_NUMBER);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing KsqlDataSourceSchema_PRO_DETAILS instance */
    private Builder(io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS other) {
            super(io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.SCHEMA$);
      if (isValidValue(fields()[0], other.CORPORATE_NAME)) {
        this.CORPORATE_NAME = data().deepCopy(fields()[0].schema(), other.CORPORATE_NAME);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.IDENTIFICATION_NUMBER)) {
        this.IDENTIFICATION_NUMBER = data().deepCopy(fields()[1].schema(), other.IDENTIFICATION_NUMBER);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.TAX_IDENTIFICATION_NUMBER)) {
        this.TAX_IDENTIFICATION_NUMBER = data().deepCopy(fields()[2].schema(), other.TAX_IDENTIFICATION_NUMBER);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'CORPORATE_NAME' field */
    public java.lang.CharSequence getCORPORATENAME() {
      return CORPORATE_NAME;
    }
    
    /** Sets the value of the 'CORPORATE_NAME' field */
    public io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder setCORPORATENAME(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.CORPORATE_NAME = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'CORPORATE_NAME' field has been set */
    public boolean hasCORPORATENAME() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'CORPORATE_NAME' field */
    public io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder clearCORPORATENAME() {
      CORPORATE_NAME = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'IDENTIFICATION_NUMBER' field */
    public java.lang.CharSequence getIDENTIFICATIONNUMBER() {
      return IDENTIFICATION_NUMBER;
    }
    
    /** Sets the value of the 'IDENTIFICATION_NUMBER' field */
    public io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder setIDENTIFICATIONNUMBER(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.IDENTIFICATION_NUMBER = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'IDENTIFICATION_NUMBER' field has been set */
    public boolean hasIDENTIFICATIONNUMBER() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'IDENTIFICATION_NUMBER' field */
    public io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder clearIDENTIFICATIONNUMBER() {
      IDENTIFICATION_NUMBER = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'TAX_IDENTIFICATION_NUMBER' field */
    public java.lang.CharSequence getTAXIDENTIFICATIONNUMBER() {
      return TAX_IDENTIFICATION_NUMBER;
    }
    
    /** Sets the value of the 'TAX_IDENTIFICATION_NUMBER' field */
    public io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder setTAXIDENTIFICATIONNUMBER(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.TAX_IDENTIFICATION_NUMBER = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'TAX_IDENTIFICATION_NUMBER' field has been set */
    public boolean hasTAXIDENTIFICATIONNUMBER() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'TAX_IDENTIFICATION_NUMBER' field */
    public io.confluent.ksql.avro_schemas.KsqlDataSourceSchema_PRO_DETAILS.Builder clearTAXIDENTIFICATIONNUMBER() {
      TAX_IDENTIFICATION_NUMBER = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public KsqlDataSourceSchema_PRO_DETAILS build() {
      try {
        KsqlDataSourceSchema_PRO_DETAILS record = new KsqlDataSourceSchema_PRO_DETAILS();
        record.CORPORATE_NAME = fieldSetFlags()[0] ? this.CORPORATE_NAME : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.IDENTIFICATION_NUMBER = fieldSetFlags()[1] ? this.IDENTIFICATION_NUMBER : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.TAX_IDENTIFICATION_NUMBER = fieldSetFlags()[2] ? this.TAX_IDENTIFICATION_NUMBER : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
