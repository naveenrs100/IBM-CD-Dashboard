//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.28 at 12:49:50 PM EDT
//

package com.ibm.rqm.xml.bind;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://jazz.net/xmlns/alm/qm/v0.1/}reportableArtifact">
 *       &lt;sequence>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}updated"/>
 *         &lt;element name="isRunning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="overallResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="associatedBuildRecord">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="executionSequence">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stepResult" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="result" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"updated", "isRunning", "startTime", "endTime", "overallResult", "associatedBuildRecord", "executionSequence", "stepResult"})
@XmlRootElement(name = "executionsequenceresult")
public class Executionsequenceresult extends ReportableArtifact
{
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar                          updated;
    
    protected Boolean                                       isRunning;
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar                          startTime;
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar                          endTime;
    
    @XmlElement(required = true)
    protected String                                        overallResult;
    
    @XmlElement(required = true)
    protected Executionsequenceresult.AssociatedBuildRecord associatedBuildRecord;
    
    @XmlElement(required = true)
    protected Executionsequenceresult.ExecutionSequence     executionSequence;
    
    protected List<Executionsequenceresult.StepResult>      stepResult;
    
    /**
     * [READ-ONLY] The timestamp for the last time execution sequence result was updated. Format is XML dateTime.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getUpdated()
    {
        return updated;
    }
    
    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setUpdated(XMLGregorianCalendar value)
    {
        this.updated = value;
    }
    
    /**
     * Gets the value of the isRunning property.
     * 
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsRunning()
    {
        return isRunning;
    }
    
    /**
     * Sets the value of the isRunning property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     */
    public void setIsRunning(Boolean value)
    {
        this.isRunning = value;
    }
    
    /**
     * Gets the value of the startTime property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getStartTime()
    {
        return startTime;
    }
    
    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setStartTime(XMLGregorianCalendar value)
    {
        this.startTime = value;
    }
    
    /**
     * Gets the value of the endTime property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEndTime()
    {
        return endTime;
    }
    
    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setEndTime(XMLGregorianCalendar value)
    {
        this.endTime = value;
    }
    
    /**
     * Gets the value of the overallResult property.
     * 
     * @return possible object is {@link String }
     */
    public String getOverallResult()
    {
        return overallResult;
    }
    
    /**
     * Sets the value of the overallResult property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setOverallResult(String value)
    {
        this.overallResult = value;
    }
    
    /**
     * Gets the value of the associatedBuildRecord property.
     * 
     * @return possible object is {@link Executionsequenceresult.AssociatedBuildRecord }
     */
    public Executionsequenceresult.AssociatedBuildRecord getAssociatedBuildRecord()
    {
        return associatedBuildRecord;
    }
    
    /**
     * Sets the value of the associatedBuildRecord property.
     * 
     * @param value
     *            allowed object is {@link Executionsequenceresult.AssociatedBuildRecord }
     */
    public void setAssociatedBuildRecord(Executionsequenceresult.AssociatedBuildRecord value)
    {
        this.associatedBuildRecord = value;
    }
    
    /**
     * Gets the value of the executionSequence property.
     * 
     * @return possible object is {@link Executionsequenceresult.ExecutionSequence }
     */
    public Executionsequenceresult.ExecutionSequence getExecutionSequence()
    {
        return executionSequence;
    }
    
    /**
     * Sets the value of the executionSequence property.
     * 
     * @param value
     *            allowed object is {@link Executionsequenceresult.ExecutionSequence }
     */
    public void setExecutionSequence(Executionsequenceresult.ExecutionSequence value)
    {
        this.executionSequence = value;
    }
    
    /**
     * Gets the value of the stepResult property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the stepResult property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getStepResult().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Executionsequenceresult.StepResult }
     */
    public List<Executionsequenceresult.StepResult> getStepResult()
    {
        if (stepResult == null)
        {
            stepResult = new ArrayList<Executionsequenceresult.StepResult>();
        }
        return this.stepResult;
    }
    
    /**
     * <p>
     * Java class for anonymous complex type.
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AssociatedBuildRecord
    {
        
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String href;
        
        @XmlAttribute(namespace = "http://schema.ibm.com/vega/2008/")
        protected String id;
        
        /**
         * Gets the value of the href property.
         * 
         * @return possible object is {@link String }
         */
        public String getHref()
        {
            return href;
        }
        
        /**
         * Sets the value of the href property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setHref(String value)
        {
            this.href = value;
        }
        
        /**
         * [READ-ONLY] UUID of the associated build record.
         * 
         * @return possible object is {@link String }
         */
        public String getId()
        {
            return id;
        }
        
        /**
         * Sets the value of the id property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setId(String value)
        {
            this.id = value;
        }
        
    }
    
    /**
     * <p>
     * Java class for anonymous complex type.
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExecutionSequence
    {
        
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String href;
        
        @XmlAttribute(namespace = "http://schema.ibm.com/vega/2008/")
        protected String id;
        
        /**
         * Gets the value of the href property.
         * 
         * @return possible object is {@link String }
         */
        public String getHref()
        {
            return href;
        }
        
        /**
         * Sets the value of the href property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setHref(String value)
        {
            this.href = value;
        }
        
        /**
         * [READ-ONLY] UUID of the execution sequence.
         * 
         * @return possible object is {@link String }
         */
        public String getId()
        {
            return id;
        }
        
        /**
         * Sets the value of the id property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setId(String value)
        {
            this.id = value;
        }
        
    }
    
    /**
     * <p>
     * Java class for anonymous complex type.
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="result" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StepResult
    {
        
        @XmlAttribute(required = true)
        protected String type;
        
        @XmlAttribute(required = true)
        protected String result;
        
        @XmlAttribute
        protected String message;
        
        /**
         * Gets the value of the type property.
         * 
         * @return possible object is {@link String }
         */
        public String getType()
        {
            return type;
        }
        
        /**
         * Sets the value of the type property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setType(String value)
        {
            this.type = value;
        }
        
        /**
         * Gets the value of the result property.
         * 
         * @return possible object is {@link String }
         */
        public String getResult()
        {
            return result;
        }
        
        /**
         * Sets the value of the result property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setResult(String value)
        {
            this.result = value;
        }
        
        /**
         * Gets the value of the message property.
         * 
         * @return possible object is {@link String }
         */
        public String getMessage()
        {
            return message;
        }
        
        /**
         * Sets the value of the message property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setMessage(String value)
        {
            this.message = value;
        }
        
    }
    
}
