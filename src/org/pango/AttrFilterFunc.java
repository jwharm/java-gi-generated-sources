package org.pango;

@FunctionalInterface
public interface AttrFilterFunc {

    /**
     * Type of a function filtering a list of attributes.
     */
    public boolean onAttrFilterFunc(Attribute attribute, jdk.incubator.foreign.MemoryAddress userData);
}
