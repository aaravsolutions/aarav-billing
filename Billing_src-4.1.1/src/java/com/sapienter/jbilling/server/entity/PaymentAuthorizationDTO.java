/*
 jBilling - The Enterprise Open Source Billing System
 Copyright (C) 2003-2011 Enterprise jBilling Software Ltd. and Emiliano Conde

 This file is part of jbilling.

 jbilling is free software: you can redistribute it and/or modify
 it under the terms of the GNU Affero General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 jbilling is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Affero General Public License for more details.

 You should have received a copy of the GNU Affero General Public License
 along with jbilling.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * Generated by XDoclet - Do not edit!
 */
package com.sapienter.jbilling.server.entity;

import javax.xml.bind.annotation.XmlType;

/**
 * Value object for PaymentAuthorizationEntity.
 */
@XmlType(name = "payment-authorization")
public class PaymentAuthorizationDTO
   extends java.lang.Object
   implements java.io.Serializable 
{
   private java.lang.Integer id;
   private boolean idHasBeenSet = false;
   private Integer paymentId;
   private java.lang.String processor;
   private boolean processorHasBeenSet = false;
   private java.lang.String code1;
   private boolean code1HasBeenSet = false;
   private java.lang.String code2;
   private boolean code2HasBeenSet = false;
   private java.lang.String code3;
   private boolean code3HasBeenSet = false;
   private java.lang.String approvalCode;
   private boolean approvalCodeHasBeenSet = false;
   private java.lang.String AVS;
   private boolean AVSHasBeenSet = false;
   private java.lang.String transactionId;
   private boolean transactionIdHasBeenSet = false;
   private java.lang.String MD5;
   private boolean MD5HasBeenSet = false;
   private java.lang.String cardCode;
   private boolean cardCodeHasBeenSet = false;
   private java.util.Date createDate;
   private boolean createDateHasBeenSet = false;
   private java.lang.String responseMessage;
   private boolean responseMessageHasBeenSet = false;

   private java.lang.Integer pk;

   public PaymentAuthorizationDTO()
   {
   }

    public PaymentAuthorizationDTO( java.lang.Integer id,Integer paymentId,java.lang.String processor,java.lang.String code1,java.lang.String code2,java.lang.String code3,java.lang.String approvalCode,java.lang.String AVS,java.lang.String transactionId,java.lang.String MD5,java.lang.String cardCode,java.util.Date createDate,java.lang.String responseMessage )
   {
      this.id = id;
      idHasBeenSet = true;
      this.paymentId = paymentId;
      this.processor = processor;
      processorHasBeenSet = true;
      this.code1 = code1;
      code1HasBeenSet = true;
      this.code2 = code2;
      code2HasBeenSet = true;
      this.code3 = code3;
      code3HasBeenSet = true;
      this.approvalCode = approvalCode;
      approvalCodeHasBeenSet = true;
      this.AVS = AVS;
      AVSHasBeenSet = true;
      this.transactionId = transactionId;
      transactionIdHasBeenSet = true;
      this.MD5 = MD5;
      MD5HasBeenSet = true;
      this.cardCode = cardCode;
      cardCodeHasBeenSet = true;
      this.createDate = createDate;
      createDateHasBeenSet = true;
      this.responseMessage = responseMessage;
      responseMessageHasBeenSet = true;
      pk = this.getId();
   }

   //TODO Cloneable is better than this !
   public PaymentAuthorizationDTO( PaymentAuthorizationDTO otherValue )
   {
      this.id = otherValue.id;
      idHasBeenSet = true;
      this.paymentId = otherValue.paymentId;
      this.processor = otherValue.processor;
      processorHasBeenSet = true;
      this.code1 = otherValue.code1;
      code1HasBeenSet = true;
      this.code2 = otherValue.code2;
      code2HasBeenSet = true;
      this.code3 = otherValue.code3;
      code3HasBeenSet = true;
      this.approvalCode = otherValue.approvalCode;
      approvalCodeHasBeenSet = true;
      this.AVS = otherValue.AVS;
      AVSHasBeenSet = true;
      this.transactionId = otherValue.transactionId;
      transactionIdHasBeenSet = true;
      this.MD5 = otherValue.MD5;
      MD5HasBeenSet = true;
      this.cardCode = otherValue.cardCode;
      cardCodeHasBeenSet = true;
      this.createDate = otherValue.createDate;
      createDateHasBeenSet = true;
      this.responseMessage = otherValue.responseMessage;
      responseMessageHasBeenSet = true;

      pk = this.getId();
   }

   public java.lang.Integer getPrimaryKey()
   {
      return pk;
   }

   public void setPrimaryKey( java.lang.Integer pk )
   {
      // it's also nice to update PK object - just in case
      // somebody would ask for it later...
      this.pk = pk;
      setId( pk );
   }

   public java.lang.Integer getId()
   {
      return this.id;
   }

   public void setId( java.lang.Integer id )
   {
      this.id = id;
      idHasBeenSet = true;

          pk = id;
   }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

   public boolean idHasBeenSet(){
      return idHasBeenSet;
   }
   public java.lang.String getProcessor()
   {
      return this.processor;
   }

   public void setProcessor( java.lang.String processor )
   {
      this.processor = processor;
      processorHasBeenSet = true;

   }

   public boolean processorHasBeenSet(){
      return processorHasBeenSet;
   }
   public java.lang.String getCode1()
   {
      return this.code1;
   }

   public void setCode1( java.lang.String code1 )
   {
      this.code1 = code1;
      code1HasBeenSet = true;

   }

   public boolean code1HasBeenSet(){
      return code1HasBeenSet;
   }
   public java.lang.String getCode2()
   {
      return this.code2;
   }

   public void setCode2( java.lang.String code2 )
   {
      this.code2 = code2;
      code2HasBeenSet = true;

   }

   public boolean code2HasBeenSet(){
      return code2HasBeenSet;
   }
   public java.lang.String getCode3()
   {
      return this.code3;
   }

   public void setCode3( java.lang.String code3 )
   {
      this.code3 = code3;
      code3HasBeenSet = true;

   }

   public boolean code3HasBeenSet(){
      return code3HasBeenSet;
   }
   public java.lang.String getApprovalCode()
   {
      return this.approvalCode;
   }

   public void setApprovalCode( java.lang.String approvalCode )
   {
      this.approvalCode = approvalCode;
      approvalCodeHasBeenSet = true;

   }

   public boolean approvalCodeHasBeenSet(){
      return approvalCodeHasBeenSet;
   }
   public java.lang.String getAVS()
   {
      return this.AVS;
   }

   public void setAVS( java.lang.String AVS )
   {
      this.AVS = AVS;
      AVSHasBeenSet = true;

   }

   public boolean AVSHasBeenSet(){
      return AVSHasBeenSet;
   }
   public java.lang.String getTransactionId()
   {
      return this.transactionId;
   }

   public void setTransactionId( java.lang.String transactionId )
   {
      this.transactionId = transactionId;
      transactionIdHasBeenSet = true;

   }

   public boolean transactionIdHasBeenSet(){
      return transactionIdHasBeenSet;
   }
   public java.lang.String getMD5()
   {
      return this.MD5;
   }

   public void setMD5( java.lang.String MD5 )
   {
      this.MD5 = MD5;
      MD5HasBeenSet = true;

   }

   public boolean MD5HasBeenSet(){
      return MD5HasBeenSet;
   }
   public java.lang.String getCardCode()
   {
      return this.cardCode;
   }

   public void setCardCode( java.lang.String cardCode )
   {
      this.cardCode = cardCode;
      cardCodeHasBeenSet = true;

   }

   public boolean cardCodeHasBeenSet(){
      return cardCodeHasBeenSet;
   }
   public java.util.Date getCreateDate()
   {
      return this.createDate;
   }

   public void setCreateDate( java.util.Date createDate )
   {
      this.createDate = createDate;
      createDateHasBeenSet = true;

   }

   public boolean createDateHasBeenSet(){
      return createDateHasBeenSet;
   }
   public java.lang.String getResponseMessage()
   {
      return this.responseMessage;
   }

   public void setResponseMessage( java.lang.String responseMessage )
   {
      this.responseMessage = responseMessage;
      responseMessageHasBeenSet = true;

   }

   public boolean responseMessageHasBeenSet(){
      return responseMessageHasBeenSet;
   }

   public String toString()
   {
      StringBuffer str = new StringBuffer("{");

      str.append("id=" + getId() + " paymentId=" + paymentId + " " + "processor=" + getProcessor() + " " + "code1=" + getCode1() + " " + "code2=" + getCode2() + " " + "code3=" + getCode3() + " " + "approvalCode=" + getApprovalCode() + " " + "AVS=" + getAVS() + " " + "transactionId=" + getTransactionId() + " " + "MD5=" + getMD5() + " " + "cardCode=" + getCardCode() + " " + "createDate=" + getCreateDate() + " " + "responseMessage=" + getResponseMessage());
      str.append('}');

      return(str.toString());
   }

   /**
    * A Value Object has an identity if the attributes making its Primary Key have all been set. An object without identity is never equal to any other object.
    *
    * @return true if this instance has an identity.
    */
   protected boolean hasIdentity()
   {
      return idHasBeenSet;
   }

   public boolean equals(Object other)
   {
      if (this == other)
         return true;
      if ( ! hasIdentity() ) return false;
      if (other instanceof PaymentAuthorizationDTO)
      {
         PaymentAuthorizationDTO that = (PaymentAuthorizationDTO) other;
         if ( ! that.hasIdentity() ) return false;
         boolean lEquals = true;
         if( this.id == null )
         {
            lEquals = lEquals && ( that.id == null );
         }
         else
         {
            lEquals = lEquals && this.id.equals( that.id );
         }

         lEquals = lEquals && isIdentical(that);

         return lEquals;
      }
      else
      {
         return false;
      }
   }

   public boolean isIdentical(Object other)
   {
      if (other instanceof PaymentAuthorizationDTO)
      {
         PaymentAuthorizationDTO that = (PaymentAuthorizationDTO) other;
         boolean lEquals = true;
         if( this.paymentId == null )
         {
            lEquals = lEquals && ( that.paymentId == null );
         }
         else
         {
            lEquals = lEquals && this.paymentId.equals( that.paymentId );
         }
         if( this.processor == null )
         {
            lEquals = lEquals && ( that.processor == null );
         }
         else
         {
            lEquals = lEquals && this.processor.equals( that.processor );
         }
         if( this.code1 == null )
         {
            lEquals = lEquals && ( that.code1 == null );
         }
         else
         {
            lEquals = lEquals && this.code1.equals( that.code1 );
         }
         if( this.code2 == null )
         {
            lEquals = lEquals && ( that.code2 == null );
         }
         else
         {
            lEquals = lEquals && this.code2.equals( that.code2 );
         }
         if( this.code3 == null )
         {
            lEquals = lEquals && ( that.code3 == null );
         }
         else
         {
            lEquals = lEquals && this.code3.equals( that.code3 );
         }
         if( this.approvalCode == null )
         {
            lEquals = lEquals && ( that.approvalCode == null );
         }
         else
         {
            lEquals = lEquals && this.approvalCode.equals( that.approvalCode );
         }
         if( this.AVS == null )
         {
            lEquals = lEquals && ( that.AVS == null );
         }
         else
         {
            lEquals = lEquals && this.AVS.equals( that.AVS );
         }
         if( this.transactionId == null )
         {
            lEquals = lEquals && ( that.transactionId == null );
         }
         else
         {
            lEquals = lEquals && this.transactionId.equals( that.transactionId );
         }
         if( this.MD5 == null )
         {
            lEquals = lEquals && ( that.MD5 == null );
         }
         else
         {
            lEquals = lEquals && this.MD5.equals( that.MD5 );
         }
         if( this.cardCode == null )
         {
            lEquals = lEquals && ( that.cardCode == null );
         }
         else
         {
            lEquals = lEquals && this.cardCode.equals( that.cardCode );
         }
         if( this.createDate == null )
         {
            lEquals = lEquals && ( that.createDate == null );
         }
         else
         {
            lEquals = lEquals && this.createDate.equals( that.createDate );
         }
         if( this.responseMessage == null )
         {
            lEquals = lEquals && ( that.responseMessage == null );
         }
         else
         {
            lEquals = lEquals && this.responseMessage.equals( that.responseMessage );
         }

         return lEquals;
      }
      else
      {
         return false;
      }
   }

   public int hashCode(){
      int result = 17;
      result = 37*result + ((this.id != null) ? this.id.hashCode() : 0);

      result = 37*result + ((this.paymentId != null) ? this.paymentId.hashCode() : 0);

      result = 37*result + ((this.processor != null) ? this.processor.hashCode() : 0);

      result = 37*result + ((this.code1 != null) ? this.code1.hashCode() : 0);

      result = 37*result + ((this.code2 != null) ? this.code2.hashCode() : 0);

      result = 37*result + ((this.code3 != null) ? this.code3.hashCode() : 0);

      result = 37*result + ((this.approvalCode != null) ? this.approvalCode.hashCode() : 0);

      result = 37*result + ((this.AVS != null) ? this.AVS.hashCode() : 0);

      result = 37*result + ((this.transactionId != null) ? this.transactionId.hashCode() : 0);

      result = 37*result + ((this.MD5 != null) ? this.MD5.hashCode() : 0);

      result = 37*result + ((this.cardCode != null) ? this.cardCode.hashCode() : 0);

      result = 37*result + ((this.createDate != null) ? this.createDate.hashCode() : 0);

      result = 37*result + ((this.responseMessage != null) ? this.responseMessage.hashCode() : 0);

      return result;
   }

}
