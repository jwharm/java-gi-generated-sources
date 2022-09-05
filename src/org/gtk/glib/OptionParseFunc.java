package org.gtk.glib;

@FunctionalInterface
public interface OptionParseFunc {

    /**
     * The type of function that can be called before and after parsing.
     */
    public boolean onOptionParseFunc(OptionContext context, OptionGroup group, jdk.incubator.foreign.MemoryAddress data);
}
