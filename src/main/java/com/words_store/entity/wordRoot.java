package com.words_store.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import com.words_store.entity.StringPrefixedSequenceIdGenerator;

@Entity
@Table(name = "word_root")
public class wordRoot {

	
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
	//@GenericGenerator(name="book_seq", strategy = "uuid")
    @GenericGenerator(
        name = "book_seq", 
        strategy = "com.words_store.entity.StringPrefixedSequenceIdGenerator", 
        parameters = {
            @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "B_"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	@Column(name = "id")
    private String id;
	private String name;
	
	
	public wordRoot( String name) {
		super();
	
		this.name = name;
	}
	
	/*@OneToMany
	private wordStore ws;*/
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
