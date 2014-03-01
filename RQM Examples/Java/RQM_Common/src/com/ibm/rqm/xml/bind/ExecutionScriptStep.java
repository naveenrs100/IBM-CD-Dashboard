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

/**
 * A section of a manual test representing a gesture or set of gestures.
 * <p>
 * Java class for step element declaration.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="step">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://purl.org/dc/elements/1.1/}title"/>
 *           &lt;element name="description" type="{http://jazz.net/xmlns/alm/qm/v0.1/}richtext"/>
 *           &lt;element name="expectedResult" type="{http://jazz.net/xmlns/alm/qm/v0.1/}richtext"/>
 *           &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="compare" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="attachment" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="link" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="requirement" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                   &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;attribute name="stepIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *         &lt;attribute ref="{http://purl.org/dc/terms/}type"/>
 *         &lt;attribute ref="{http://www.w3.org/1999/02/22-rdf-syntax-ns#}about"/>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"title", "description", "expectedResult", "comment", "compare", "attachment", "link", "requirement"})
@XmlRootElement(name = "step")
public class ExecutionScriptStep
{
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String                                title;
    
    @XmlElement(required = true)
    protected Richtext                              description;
    
    @XmlElement(required = true)
    protected Richtext                              expectedResult;
    
    @XmlElement(required = true)
    protected String                                comment;
    
    @XmlElement(required = true)
    protected String                                compare;
    
    protected List<ExecutionScriptStep.Attachment>  attachment;
    
    protected ExecutionScriptStep.Link              link;
    
    protected List<ExecutionScriptStep.Requirement> requirement;
    
    @XmlAttribute
    protected Integer                               stepIndex;
    
    @XmlAttribute(namespace = "http://purl.org/dc/terms/")
    protected String                                type;
    
    @XmlAttribute(namespace = "http://www.w3.org/1999/02/22-rdf-syntax-ns#")
    @XmlSchemaType(name = "anyURI")
    protected String                                about;
    
    /**
     * A name given to the step.
     * 
     * @return possible object is {@link String }
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Sets the value of the title property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setTitle(String value)
    {
        this.title = value;
    }
    
    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link Richtext }
     */
    public Richtext getDescription()
    {
        return description;
    }
    
    /**
     * Sets the value of the description property.
     * 
     * @param value
     *            allowed object is {@link Richtext }
     */
    public void setDescription(Richtext value)
    {
        this.description = value;
    }
    
    /**
     * Gets the value of the expectedResult property.
     * 
     * @return possible object is {@link Richtext }
     */
    public Richtext getExpectedResult()
    {
        return expectedResult;
    }
    
    /**
     * Sets the value of the expectedResult property.
     * 
     * @param value
     *            allowed object is {@link Richtext }
     */
    public void setExpectedResult(Richtext value)
    {
        this.expectedResult = value;
    }
    
    /**
     * Gets the value of the comment property.
     * 
     * @return possible object is {@link String }
     */
    public String getComment()
    {
        return comment;
    }
    
    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setComment(String value)
    {
        this.comment = value;
    }
    
    /**
     * Gets the value of the compare property.
     * 
     * @return possible object is {@link String }
     */
    public String getCompare()
    {
        return compare;
    }
    
    /**
     * Sets the value of the compare property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setCompare(String value)
    {
        this.compare = value;
    }
    
    /**
     * Gets the value of the attachment property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the attachment property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAttachment().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ExecutionScriptStep.Attachment }
     */
    public List<ExecutionScriptStep.Attachment> getAttachment()
    {
        if (attachment == null)
        {
            attachment = new ArrayList<ExecutionScriptStep.Attachment>();
        }
        return this.attachment;
    }
    
    /**
     * Gets the value of the link property.
     * 
     * @return possible object is {@link ExecutionScriptStep.Link }
     */
    public ExecutionScriptStep.Link getLink()
    {
        return link;
    }
    
    /**
     * Sets the value of the link property.
     * 
     * @param value
     *            allowed object is {@link ExecutionScriptStep.Link }
     */
    public void setLink(ExecutionScriptStep.Link value)
    {
        this.link = value;
    }
    
    /**
     * Gets the value of the requirement property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the requirement property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getRequirement().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ExecutionScriptStep.Requirement }
     */
    public List<ExecutionScriptStep.Requirement> getRequirement()
    {
        if (requirement == null)
        {
            requirement = new ArrayList<ExecutionScriptStep.Requirement>();
        }
        return this.requirement;
    }
    
    /**
     * Gets the value of the stepIndex property.
     * 
     * @return possible object is {@link Integer }
     */
    public Integer getStepIndex()
    {
        return stepIndex;
    }
    
    /**
     * Sets the value of the stepIndex property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     */
    public void setStepIndex(Integer value)
    {
        this.stepIndex = value;
    }
    
    /**
     * The type of step. Will be either "execution" or "reporting".
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
     * The URL of the step.
     * 
     * @return possible object is {@link String }
     */
    public String getAbout()
    {
        return about;
    }
    
    /**
     * Sets the value of the about property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setAbout(String value)
    {
        this.about = value;
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
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Attachment
    {
        
        @XmlAttribute(required = true)
        protected String href;
        
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
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Link
    {
        
        @XmlAttribute(required = true)
        protected String href;
        
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
     *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Requirement
    {
        
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String href;
        
        @XmlAttribute
        protected String summary;
        
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
         * Gets the value of the summary property.
         * 
         * @return possible object is {@link String }
         */
        public String getSummary()
        {
            return summary;
        }
        
        /**
         * Sets the value of the summary property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setSummary(String value)
        {
            this.summary = value;
        }
        
    }
    
}