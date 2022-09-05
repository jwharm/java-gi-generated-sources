package org.pango;

@FunctionalInterface
public interface FontsetForeachFunc {

    /**
     * Callback used when enumerating fonts in a fontset.
     * 
     * See [method@Pango.Fontset.foreach].
     */
    public boolean onFontsetForeachFunc(Fontset fontset, Font font, jdk.incubator.foreign.MemoryAddress userData);
}
