package org.pango;

/**
 * Type of a function filtering a list of attributes.
 */
@FunctionalInterface
public interface AttrFilterFunc {
        boolean onAttrFilterFunc(Attribute attribute);
}
