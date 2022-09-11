package org.pango;

/**
 * Type of a function that can duplicate user data for an attribute.
 */
@FunctionalInterface
public interface AttrDataCopyFunc {
        jdk.incubator.foreign.MemoryAddress onAttrDataCopyFunc();
}
