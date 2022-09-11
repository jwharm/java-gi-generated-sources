package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleBeginLoadFunc {

        void onPixbufModuleBeginLoadFunc(PixbufModuleSizeFunc sizeFunc, PixbufModulePreparedFunc preparedFunc, PixbufModuleUpdatedFunc updatedFunc);
}
