
package com.bullhorn.entity.template.job;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.template.EntityTemplateAttributeDto;


/**
 * <p>Java class for jobOrderTemplateAttributeDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobOrderTemplateAttributeDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://template.entity.bullhorn.com/}entityTemplateAttributeDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobOrderTemplateAttributeDtoBase")
@XmlSeeAlso({
    JobOrderTemplateAttributeDto.class
})
public abstract class JobOrderTemplateAttributeDtoBase
    extends EntityTemplateAttributeDto
{


}
