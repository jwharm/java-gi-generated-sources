package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The location and size of a rectangle region.
 * <p>
 * The width and height of a {@link Rect} can be negative; for instance,
 * a {@link Rect} with an origin of [ 0, 0 ] and a size of [ 10, 10 ] is
 * equivalent to a {@link Rect} with an origin of [ 10, 10 ] and a size
 * of [ -10, -10 ].
 * <p>
 * Application code can normalize rectangles using graphene_rect_normalize();
 * this function will ensure that the width and height of a rectangle are
 * positive values. All functions taking a {@link Rect} as an argument
 * will internally operate on a normalized copy; all functions returning a
 * {@link Rect} will always return a normalized rectangle.
 * @version 1.0
 */
public class Rect extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_rect_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.graphene.Point.getMemoryLayout().withName("origin"),
            org.gtk.graphene.Size.getMemoryLayout().withName("size")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Rect}
     * @return A new, uninitialized @{link Rect}
     */
    public static Rect allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Rect newInstance = new Rect(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code origin}
     * @return The value of the field {@code origin}
     */
    public org.gtk.graphene.Point getOrigin() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("origin"));
        return org.gtk.graphene.Point.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code origin}
     * @param origin The new value of the field {@code origin}
     */
    public void setOrigin(org.gtk.graphene.Point origin) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("origin"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (origin == null ? MemoryAddress.NULL : origin.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public org.gtk.graphene.Size getSize() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("size"));
        return org.gtk.graphene.Size.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(org.gtk.graphene.Size size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (size == null ? MemoryAddress.NULL : size.handle()));
        }
    }
    
    /**
     * Create a Rect proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Rect(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Rect> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Rect(input);
    
    /**
     * Checks whether a {@link Rect} contains the given coordinates.
     * @param p a {@link Point}
     * @return {@code true} if the rectangle contains the point
     */
    public boolean containsPoint(org.gtk.graphene.Point p) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_rect_contains_point.invokeExact(
                    handle(),
                    p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether a {@link Rect} fully contains the given
     * rectangle.
     * @param b a {@link Rect}
     * @return {@code true} if the rectangle {@code a} fully contains {@code b}
     */
    public boolean containsRect(org.gtk.graphene.Rect b) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_rect_contains_rect.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the two given rectangle are equal.
     * @param b a {@link Rect}
     * @return {@code true} if the rectangles are equal
     */
    public boolean equal(org.gtk.graphene.Rect b) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_rect_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Expands a {@link Rect} to contain the given {@link Point}.
     * @param p a {@link Point}
     * @param res return location for the expanded rectangle
     */
    public void expand(org.gtk.graphene.Point p, org.gtk.graphene.Rect res) {
        try {
            DowncallHandles.graphene_rect_expand.invokeExact(
                    handle(),
                    p.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the resources allocated by graphene_rect_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_rect_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compute the area of given normalized rectangle.
     * @return the area of the normalized rectangle
     */
    public float getArea() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_rect_get_area.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the coordinates of the bottom-left corner of the given rectangle.
     * @param p return location for a {@link Point}
     */
    public void getBottomLeft(org.gtk.graphene.Point p) {
        try {
            DowncallHandles.graphene_rect_get_bottom_left.invokeExact(
                    handle(),
                    p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the coordinates of the bottom-right corner of the given rectangle.
     * @param p return location for a {@link Point}
     */
    public void getBottomRight(org.gtk.graphene.Point p) {
        try {
            DowncallHandles.graphene_rect_get_bottom_right.invokeExact(
                    handle(),
                    p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the coordinates of the center of the given rectangle.
     * @param p return location for a {@link Point}
     */
    public void getCenter(org.gtk.graphene.Point p) {
        try {
            DowncallHandles.graphene_rect_get_center.invokeExact(
                    handle(),
                    p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the normalized height of the given rectangle.
     * @return the normalized height of the rectangle
     */
    public float getHeight() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_rect_get_height.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the coordinates of the top-left corner of the given rectangle.
     * @param p return location for a {@link Point}
     */
    public void getTopLeft(org.gtk.graphene.Point p) {
        try {
            DowncallHandles.graphene_rect_get_top_left.invokeExact(
                    handle(),
                    p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the coordinates of the top-right corner of the given rectangle.
     * @param p return location for a {@link Point}
     */
    public void getTopRight(org.gtk.graphene.Point p) {
        try {
            DowncallHandles.graphene_rect_get_top_right.invokeExact(
                    handle(),
                    p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the four vertices of a {@link Rect}.
     * @param vertices return location for an array
     *  of 4 {@link Vec2}
     */
    public void getVertices(Out<org.gtk.graphene.Vec2[]> vertices) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment verticesPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.graphene_rect_get_vertices.invokeExact(
                        handle(),
                        (Addressable) verticesPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            org.gtk.graphene.Vec2[] verticesARRAY = new org.gtk.graphene.Vec2[4];
            for (int I = 0; I < 4; I++) {
                var OBJ = verticesPOINTER.get(Interop.valueLayout.ADDRESS, I);
                verticesARRAY[I] = org.gtk.graphene.Vec2.fromAddress.marshal(OBJ, null);
                }
            vertices.set(verticesARRAY);
        }
    }
    
    /**
     * Retrieves the normalized width of the given rectangle.
     * @return the normalized width of the rectangle
     */
    public float getWidth() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_rect_get_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the normalized X coordinate of the origin of the given
     * rectangle.
     * @return the normalized X coordinate of the rectangle
     */
    public float getX() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_rect_get_x.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the normalized Y coordinate of the origin of the given
     * rectangle.
     * @return the normalized Y coordinate of the rectangle
     */
    public float getY() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_rect_get_y.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes the given {@link Rect} with the given values.
     * <p>
     * This function will implicitly normalize the {@link Rect}
     * before returning.
     * @param x the X coordinate of the {@code graphene_rect_t}.origin
     * @param y the Y coordinate of the {@code graphene_rect_t}.origin
     * @param width the width of the {@code graphene_rect_t}.size
     * @param height the height of the {@code graphene_rect_t}.size
     * @return the initialized rectangle
     */
    public org.gtk.graphene.Rect init(float x, float y, float width, float height) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_rect_init.invokeExact(
                    handle(),
                    x,
                    y,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Rect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes {@code r} using the given {@code src} rectangle.
     * <p>
     * This function will implicitly normalize the {@link Rect}
     * before returning.
     * @param src a {@link Rect}
     * @return the initialized rectangle
     */
    public org.gtk.graphene.Rect initFromRect(org.gtk.graphene.Rect src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_rect_init_from_rect.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Rect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Changes the given rectangle to be smaller, or larger depending on the
     * given inset parameters.
     * <p>
     * To create an inset rectangle, use positive {@code d_x} or {@code d_y} values; to
     * create a larger, encompassing rectangle, use negative {@code d_x} or {@code d_y}
     * values.
     * <p>
     * The origin of the rectangle is offset by {@code d_x} and {@code d_y}, while the size
     * is adjusted by {@code (2 * @d_x, 2 * @d_y)}. If {@code d_x} and {@code d_y} are positive
     * values, the size of the rectangle is decreased; if {@code d_x} and {@code d_y} are
     * negative values, the size of the rectangle is increased.
     * <p>
     * If the size of the resulting inset rectangle has a negative width or
     * height then the size will be set to zero.
     * @param dX the horizontal inset
     * @param dY the vertical inset
     * @return the inset rectangle
     */
    public org.gtk.graphene.Rect inset(float dX, float dY) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_rect_inset.invokeExact(
                    handle(),
                    dX,
                    dY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Rect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Changes the given rectangle to be smaller, or larger depending on the
     * given inset parameters.
     * <p>
     * To create an inset rectangle, use positive {@code d_x} or {@code d_y} values; to
     * create a larger, encompassing rectangle, use negative {@code d_x} or {@code d_y}
     * values.
     * <p>
     * The origin of the rectangle is offset by {@code d_x} and {@code d_y}, while the size
     * is adjusted by {@code (2 * @d_x, 2 * @d_y)}. If {@code d_x} and {@code d_y} are positive
     * values, the size of the rectangle is decreased; if {@code d_x} and {@code d_y} are
     * negative values, the size of the rectangle is increased.
     * <p>
     * If the size of the resulting inset rectangle has a negative width or
     * height then the size will be set to zero.
     * @param dX the horizontal inset
     * @param dY the vertical inset
     * @param res return location for the inset rectangle
     */
    public void insetR(float dX, float dY, org.gtk.graphene.Rect res) {
        try {
            DowncallHandles.graphene_rect_inset_r.invokeExact(
                    handle(),
                    dX,
                    dY,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Linearly interpolates the origin and size of the two given
     * rectangles.
     * @param b a {@link Rect}
     * @param factor the linear interpolation factor
     * @param res return location for the
     *   interpolated rectangle
     */
    public void interpolate(org.gtk.graphene.Rect b, double factor, org.gtk.graphene.Rect res) {
        try {
            DowncallHandles.graphene_rect_interpolate.invokeExact(
                    handle(),
                    b.handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the intersection of the two given rectangles.
     * <p>
     * <img src="./doc-files/rectangle-intersection.png" alt="">
     * <p>
     * The intersection in the image above is the blue outline.
     * <p>
     * If the two rectangles do not intersect, {@code res} will contain
     * a degenerate rectangle with origin in (0, 0) and a size of 0.
     * @param b a {@link Rect}
     * @param res return location for
     *   a {@link Rect}
     * @return {@code true} if the two rectangles intersect
     */
    public boolean intersection(org.gtk.graphene.Rect b, @Nullable org.gtk.graphene.Rect res) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_rect_intersection.invokeExact(
                    handle(),
                    b.handle(),
                    (Addressable) (res == null ? MemoryAddress.NULL : res.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Normalizes the passed rectangle.
     * <p>
     * This function ensures that the size of the rectangle is made of
     * positive values, and that the origin is the top-left corner of
     * the rectangle.
     * @return the normalized rectangle
     */
    public org.gtk.graphene.Rect normalize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_rect_normalize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Rect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Normalizes the passed rectangle.
     * <p>
     * This function ensures that the size of the rectangle is made of
     * positive values, and that the origin is in the top-left corner
     * of the rectangle.
     * @param res the return location for the
     *   normalized rectangle
     */
    public void normalizeR(org.gtk.graphene.Rect res) {
        try {
            DowncallHandles.graphene_rect_normalize_r.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Offsets the origin by {@code d_x} and {@code d_y}.
     * <p>
     * The size of the rectangle is unchanged.
     * @param dX the horizontal offset
     * @param dY the vertical offset
     * @return the offset rectangle
     */
    public org.gtk.graphene.Rect offset(float dX, float dY) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_rect_offset.invokeExact(
                    handle(),
                    dX,
                    dY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Rect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Offsets the origin of the given rectangle by {@code d_x} and {@code d_y}.
     * <p>
     * The size of the rectangle is left unchanged.
     * @param dX the horizontal offset
     * @param dY the vertical offset
     * @param res return location for the offset
     *   rectangle
     */
    public void offsetR(float dX, float dY, org.gtk.graphene.Rect res) {
        try {
            DowncallHandles.graphene_rect_offset_r.invokeExact(
                    handle(),
                    dX,
                    dY,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Rounds the origin and size of the given rectangle to
     * their nearest integer values; the rounding is guaranteed
     * to be large enough to have an area bigger or equal to the
     * original rectangle, but might not fully contain its extents.
     * Use graphene_rect_round_extents() in case you need to round
     * to a rectangle that covers fully the original one.
     * <p>
     * This function is the equivalent of calling {@code floor} on
     * the coordinates of the origin, and {@code ceil} on the size.
     * @param res return location for the
     *   rounded rectangle
     * @deprecated Use graphene_rect_round_extents() instead
     */
    @Deprecated
    public void round(org.gtk.graphene.Rect res) {
        try {
            DowncallHandles.graphene_rect_round.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Rounds the origin of the given rectangle to its nearest
     * integer value and and recompute the size so that the
     * rectangle is large enough to contain all the conrners
     * of the original rectangle.
     * <p>
     * This function is the equivalent of calling {@code floor} on
     * the coordinates of the origin, and recomputing the size
     * calling {@code ceil} on the bottom-right coordinates.
     * <p>
     * If you want to be sure that the rounded rectangle
     * completely covers the area that was covered by the
     * original rectangle — i.e. you want to cover the area
     * including all its corners — this function will make sure
     * that the size is recomputed taking into account the ceiling
     * of the coordinates of the bottom-right corner.
     * If the difference between the original coordinates and the
     * coordinates of the rounded rectangle is greater than the
     * difference between the original size and and the rounded
     * size, then the move of the origin would not be compensated
     * by a move in the anti-origin, leaving the corners of the
     * original rectangle outside the rounded one.
     * @param res return location for the
     *   rectangle with rounded extents
     */
    public void roundExtents(org.gtk.graphene.Rect res) {
        try {
            DowncallHandles.graphene_rect_round_extents.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Rounds the origin and the size of the given rectangle to
     * their nearest integer values; the rounding is guaranteed
     * to be large enough to contain the original rectangle.
     * @return the pixel-aligned rectangle.
     * @deprecated Use graphene_rect_round() instead
     */
    @Deprecated
    public org.gtk.graphene.Rect roundToPixel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_rect_round_to_pixel.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Rect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Scales the size and origin of a rectangle horizontaly by {@code s_h},
     * and vertically by {@code s_v}. The result {@code res} is normalized.
     * @param sH horizontal scale factor
     * @param sV vertical scale factor
     * @param res return location for the
     *   scaled rectangle
     */
    public void scale(float sH, float sV, org.gtk.graphene.Rect res) {
        try {
            DowncallHandles.graphene_rect_scale.invokeExact(
                    handle(),
                    sH,
                    sV,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the union of the two given rectangles.
     * <p>
     * <img src="./doc-files/rectangle-union.png" alt="">
     * <p>
     * The union in the image above is the blue outline.
     * @param b a {@link Rect}
     * @param res return location for a {@link Rect}
     */
    public void union(org.gtk.graphene.Rect b, org.gtk.graphene.Rect res) {
        try {
            DowncallHandles.graphene_rect_union.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Rect}.
     * <p>
     * The contents of the returned rectangle are undefined.
     * @return the newly allocated rectangle
     */
    public static org.gtk.graphene.Rect alloc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_rect_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.graphene.Rect.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns a degenerate rectangle with origin fixed at (0, 0) and
     * a size of 0, 0.
     * @return a fixed rectangle
     */
    public static org.gtk.graphene.Rect zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_rect_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Rect.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_rect_contains_point = Interop.downcallHandle(
                "graphene_rect_contains_point",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_contains_rect = Interop.downcallHandle(
                "graphene_rect_contains_rect",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_equal = Interop.downcallHandle(
                "graphene_rect_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_expand = Interop.downcallHandle(
                "graphene_rect_expand",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_free = Interop.downcallHandle(
                "graphene_rect_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_get_area = Interop.downcallHandle(
                "graphene_rect_get_area",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_get_bottom_left = Interop.downcallHandle(
                "graphene_rect_get_bottom_left",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_get_bottom_right = Interop.downcallHandle(
                "graphene_rect_get_bottom_right",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_get_center = Interop.downcallHandle(
                "graphene_rect_get_center",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_get_height = Interop.downcallHandle(
                "graphene_rect_get_height",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_get_top_left = Interop.downcallHandle(
                "graphene_rect_get_top_left",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_get_top_right = Interop.downcallHandle(
                "graphene_rect_get_top_right",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_get_vertices = Interop.downcallHandle(
                "graphene_rect_get_vertices",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_get_width = Interop.downcallHandle(
                "graphene_rect_get_width",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_get_x = Interop.downcallHandle(
                "graphene_rect_get_x",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_get_y = Interop.downcallHandle(
                "graphene_rect_get_y",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_init = Interop.downcallHandle(
                "graphene_rect_init",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_rect_init_from_rect = Interop.downcallHandle(
                "graphene_rect_init_from_rect",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_inset = Interop.downcallHandle(
                "graphene_rect_inset",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_rect_inset_r = Interop.downcallHandle(
                "graphene_rect_inset_r",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_interpolate = Interop.downcallHandle(
                "graphene_rect_interpolate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_intersection = Interop.downcallHandle(
                "graphene_rect_intersection",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_normalize = Interop.downcallHandle(
                "graphene_rect_normalize",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_normalize_r = Interop.downcallHandle(
                "graphene_rect_normalize_r",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_offset = Interop.downcallHandle(
                "graphene_rect_offset",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_rect_offset_r = Interop.downcallHandle(
                "graphene_rect_offset_r",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_round = Interop.downcallHandle(
                "graphene_rect_round",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_round_extents = Interop.downcallHandle(
                "graphene_rect_round_extents",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_round_to_pixel = Interop.downcallHandle(
                "graphene_rect_round_to_pixel",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_scale = Interop.downcallHandle(
                "graphene_rect_scale",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_union = Interop.downcallHandle(
                "graphene_rect_union",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_alloc = Interop.downcallHandle(
                "graphene_rect_alloc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_rect_zero = Interop.downcallHandle(
                "graphene_rect_zero",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Rect.Builder} object constructs a {@link Rect} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Rect.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Rect struct;
        
        private Builder() {
            struct = Rect.allocate();
        }
        
        /**
         * Finish building the {@link Rect} struct.
         * @return A new instance of {@code Rect} with the fields 
         *         that were set in the Builder object.
         */
        public Rect build() {
            return struct;
        }
        
        /**
         * the coordinates of the origin of the rectangle
         * @param origin The value for the {@code origin} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOrigin(org.gtk.graphene.Point origin) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("origin"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (origin == null ? MemoryAddress.NULL : origin.handle()));
                return this;
            }
        }
        
        /**
         * the size of the rectangle
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(org.gtk.graphene.Size size) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (size == null ? MemoryAddress.NULL : size.handle()));
                return this;
            }
        }
    }
}
