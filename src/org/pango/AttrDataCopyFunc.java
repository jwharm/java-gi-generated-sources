package org.pango;

@FunctionalInterface
public interface AttrDataCopyFunc {

    /**
     * Type of a function that can duplicate user data for an attribute.
     */
    public jdk.incubator.foreign.MemoryAddress onAttrDataCopyFunc(jdk.incubator.foreign.MemoryAddress userData);
}
