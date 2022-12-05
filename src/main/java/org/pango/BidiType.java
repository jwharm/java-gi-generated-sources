package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoBidiType} represents the bidirectional character
 * type of a Unicode character.
 * <p>
 * The values in this enumeration are specified by the
 * <a href="http://www.unicode.org/reports/tr9/">Unicode bidirectional algorithm</a>.
 * @version 1.22
 */
public enum BidiType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Left-to-Right
     */
    L(0),
    /**
     * Left-to-Right Embedding
     */
    LRE(1),
    /**
     * Left-to-Right Override
     */
    LRO(2),
    /**
     * Right-to-Left
     */
    R(3),
    /**
     * Right-to-Left Arabic
     */
    AL(4),
    /**
     * Right-to-Left Embedding
     */
    RLE(5),
    /**
     * Right-to-Left Override
     */
    RLO(6),
    /**
     * Pop Directional Format
     */
    PDF(7),
    /**
     * European Number
     */
    EN(8),
    /**
     * European Number Separator
     */
    ES(9),
    /**
     * European Number Terminator
     */
    ET(10),
    /**
     * Arabic Number
     */
    AN(11),
    /**
     * Common Number Separator
     */
    CS(12),
    /**
     * Nonspacing Mark
     */
    NSM(13),
    /**
     * Boundary Neutral
     */
    BN(14),
    /**
     * Paragraph Separator
     */
    B(15),
    /**
     * Segment Separator
     */
    S(16),
    /**
     * Whitespace
     */
    WS(17),
    /**
     * Other Neutrals
     */
    ON(18),
    /**
     * Left-to-Right isolate. Since 1.48.6
     */
    LRI(19),
    /**
     * Right-to-Left isolate. Since 1.48.6
     */
    RLI(20),
    /**
     * First strong isolate. Since 1.48.6
     */
    FSI(21),
    /**
     * Pop directional isolate. Since 1.48.6
     */
    PDI(22);
    
    private static final java.lang.String C_TYPE_NAME = "PangoBidiType";
    
    private final int value;
    BidiType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static BidiType of(int value) {
        return switch (value) {
            case 0 -> L;
            case 1 -> LRE;
            case 2 -> LRO;
            case 3 -> R;
            case 4 -> AL;
            case 5 -> RLE;
            case 6 -> RLO;
            case 7 -> PDF;
            case 8 -> EN;
            case 9 -> ES;
            case 10 -> ET;
            case 11 -> AN;
            case 12 -> CS;
            case 13 -> NSM;
            case 14 -> BN;
            case 15 -> B;
            case 16 -> S;
            case 17 -> WS;
            case 18 -> ON;
            case 19 -> LRI;
            case 20 -> RLI;
            case 21 -> FSI;
            case 22 -> PDI;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Determines the bidirectional type of a character.
     * <p>
     * The bidirectional type is specified in the Unicode Character Database.
     * <p>
     * A simplified version of this function is available as {@link Pango#unicharDirection}.
     * @param ch a Unicode character
     * @return the bidirectional character type, as used in the
     * Unicode bidirectional algorithm.
     */
    public static @NotNull org.pango.BidiType forUnichar(int ch) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_bidi_type_for_unichar.invokeExact(
                    ch);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.BidiType.of(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_bidi_type_for_unichar = Interop.downcallHandle(
            "pango_bidi_type_for_unichar",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
