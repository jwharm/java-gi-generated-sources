package org.pango.cairo;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function type for rendering attributes of type {@link org.pango.AttrType#SHAPE}
 * with Pango's Cairo renderer.
 */
@FunctionalInterface
public interface ShapeRendererFunc {
        void onShapeRendererFunc(@NotNull org.cairographics.Context cr, @NotNull org.pango.AttrShape attr, boolean doPath);
}
