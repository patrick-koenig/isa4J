/**
 * Copyright (c) 2019 Leibniz Institute of Plant Genetics and Crop Plant Research (IPK), Gatersleben, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU GPLv3 license (https://www.gnu.org/licenses/gpl-3.0.en.html)
 *
 * Contributors:
 *      Leibniz Institute of Plant Genetics and Crop Plant Research (IPK), Gatersleben, Germany
 */
package de.ipk_gatersleben.bit.bi.isa4j.components;

import java.util.Objects;

/**
 * Class representing a {@link Ontology} based term. Every {@link OntologyAnnotation} has
 * three Attributes: Name, AccessionNumber and SourceREF
 *
 * @author liufe, arendd
 */
public class OntologyAnnotation extends Commentable {

    /**
     * term of Ontology term
     */
    private String term;

    /**
     * accession number of ontology term
     */
    private String termAccession;

    /**
     * sourceREF of ontology term
     */
    private Ontology sourceREF;
    
    public OntologyAnnotation(String term) {
    	this(term,  null, null);
    }
    
    public OntologyAnnotation(String term, String termAccessionNumber, Ontology sourceREF) {
    	this.term = term;
    	this.termAccession = termAccessionNumber;
    	this.sourceREF = sourceREF;
    }
   

    /**
     * get sourceREF
     *
     * @return sourceREF
     */
    public Ontology getSourceREF() {
        return sourceREF;
    }

    /**
     * get term of ontology term
     *
     * @return term of ontology term
     */
    public String getTerm() {
        return term;
    }

    /**
     * get accession number of ontology term
     *
     * @return accession number of ontology term
     */
    public String getTermAccession() {
        return termAccession;
    }

    /**
     * set source REF
     *
     * @param sourceREF source REF
     */
    public void setSourceREF(Ontology sourceREF) {
        this.sourceREF = sourceREF;
    }

    /**
     * set term of ontology term
     *
     * @param term term of ontology term
     */
    public void setTerm(String term) {
        Objects.requireNonNull(term);
        this.term = term;
    }

    /**
     * set accession number of ontology term
     *
     * @param termAccession accession number of ontology term
     */
    public void setTermAccession(String termAccession) {
        this.termAccession = termAccession;
    }

}
