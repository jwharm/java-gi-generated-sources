package org.gtk.gdkpixbuf;

/**
 * Finalizes the image loading state.
 * <p>
 * This function is called on success and error states.
 */
@FunctionalInterface
public interface PixbufModuleStopLoadFunc {
        boolean onPixbufModuleStopLoadFunc(jdk.incubator.foreign.MemoryAddress context);
}
