package org.gtk.glib;

@FunctionalInterface
public interface OptionErrorFunc {

    /**
     * The type of function to be used as callback when a parse error occurs.
     */
    public void onOptionErrorFunc(OptionContext context, OptionGroup group, jdk.incubator.foreign.MemoryAddress data);
}
