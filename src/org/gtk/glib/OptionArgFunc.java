package org.gtk.glib;

@FunctionalInterface
public interface OptionArgFunc {

    /**
     * The type of function to be passed as callback for %G_OPTION_ARG_CALLBACK
     * options.
     */
    public boolean onOptionArgFunc(java.lang.String optionName, java.lang.String value, jdk.incubator.foreign.MemoryAddress data);
}
