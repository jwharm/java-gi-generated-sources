package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleSizeFunc {

    /**
     * Defines the type of the function that gets called once the size
     * of the loaded image is known.
     * 
     * The function is expected to set @width and @height to the desired
     * size to which the image should be scaled. If a module has no efficient
     * way to achieve the desired scaling during the loading of the image, it may
     * either ignore the size request, or only approximate it - gdk-pixbuf will
     * then perform the required scaling on the completely loaded image.
     * 
     * If the function sets @width or @height to zero, the module should interpret
     * this as a hint that it will be closed soon and shouldn't allocate further
     * resources. This convention is used to implement gdk_pixbuf_get_file_info()
     * efficiently.
     */
    public void onPixbufModuleSizeFunc(int width, int height, jdk.incubator.foreign.MemoryAddress userData);
}
