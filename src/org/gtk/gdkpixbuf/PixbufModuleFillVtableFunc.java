package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleFillVtableFunc {

    /**
     * Defines the type of the function used to set the vtable of a
     * #GdkPixbufModule when it is loaded.
     */
    public void onPixbufModuleFillVtableFunc(PixbufModule module);
}
