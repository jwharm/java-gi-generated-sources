package org.gtk.glib;

/**
 * The type of function to be passed as callback for %G_OPTION_ARG_CALLBACK
 * options.
 */
@FunctionalInterface
public interface OptionArgFunc {
        boolean onOptionArgFunc(java.lang.String optionName, java.lang.String value);
}
