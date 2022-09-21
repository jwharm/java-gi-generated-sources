package org.gtk.glib;

/**
 * The type of function to be passed as callback for {@link OptionArg#CALLBACK}
 * options.
 */
@FunctionalInterface
public interface OptionArgFunc {
        boolean onOptionArgFunc(java.lang.String optionName, java.lang.String value);
}
