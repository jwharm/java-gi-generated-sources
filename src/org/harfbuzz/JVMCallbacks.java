package org.harfbuzz;

import jdk.incubator.foreign.*;
import java.util.HashMap;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static final HashMap<java.lang.Integer, java.lang.Object> signalRegistry = new HashMap<>();
    
    public static void cbUnicodeEastasianWidthFuncT(MemoryAddress ufuncs, MemoryAddress unicode, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (UnicodeEastasianWidthFuncT) signalRegistry.get(hash);
        handler.onUnicodeEastasianWidthFuncT(new UnicodeFuncsT(References.get(ufuncs, false)), CodepointT.fromValue(unicode));
    }
    
    public static void cbDrawQuadraticToFuncT(MemoryAddress dfuncs, MemoryAddress drawData, MemoryAddress st, float controlX, float controlY, float toX, float toY, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DrawQuadraticToFuncT) signalRegistry.get(hash);
        handler.onDrawQuadraticToFuncT(new DrawFuncsT(References.get(dfuncs, false)), drawData, new DrawStateT(References.get(st, false)), controlX, controlY, toX, toY);
    }
    
    public static void cbUnicodeScriptFuncT(MemoryAddress ufuncs, MemoryAddress unicode, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (UnicodeScriptFuncT) signalRegistry.get(hash);
        handler.onUnicodeScriptFuncT(new UnicodeFuncsT(References.get(ufuncs, false)), CodepointT.fromValue(unicode));
    }
    
    public static void cbDestroyFuncT(MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DestroyFuncT) signalRegistry.get(hash);
        handler.onDestroyFuncT();
    }
    
    public static void cbUnicodeComposeFuncT(MemoryAddress ufuncs, MemoryAddress a, MemoryAddress b, MemoryAddress ab, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (UnicodeComposeFuncT) signalRegistry.get(hash);
        handler.onUnicodeComposeFuncT(new UnicodeFuncsT(References.get(ufuncs, false)), CodepointT.fromValue(a), CodepointT.fromValue(b), CodepointT.fromValue(ab));
    }
    
    public static void cbDrawClosePathFuncT(MemoryAddress dfuncs, MemoryAddress drawData, MemoryAddress st, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DrawClosePathFuncT) signalRegistry.get(hash);
        handler.onDrawClosePathFuncT(new DrawFuncsT(References.get(dfuncs, false)), drawData, new DrawStateT(References.get(st, false)));
    }
    
    public static void cbFontGetGlyphAdvanceFuncT(MemoryAddress font, MemoryAddress fontData, MemoryAddress glyph, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetGlyphAdvanceFuncT) signalRegistry.get(hash);
        handler.onFontGetGlyphAdvanceFuncT(new FontT(References.get(font, false)), fontData, CodepointT.fromValue(glyph));
    }
    
    public static void cbUnicodeGeneralCategoryFuncT(MemoryAddress ufuncs, MemoryAddress unicode, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (UnicodeGeneralCategoryFuncT) signalRegistry.get(hash);
        handler.onUnicodeGeneralCategoryFuncT(new UnicodeFuncsT(References.get(ufuncs, false)), CodepointT.fromValue(unicode));
    }
    
    public static void cbBufferMessageFuncT(MemoryAddress buffer, MemoryAddress font, MemoryAddress message, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (BufferMessageFuncT) signalRegistry.get(hash);
        handler.onBufferMessageFuncT(new BufferT(References.get(buffer, false)), new FontT(References.get(font, false)), message.getUtf8String(0));
    }
    
    public static void cbFontGetFontExtentsFuncT(MemoryAddress font, MemoryAddress fontData, MemoryAddress extents, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetFontExtentsFuncT) signalRegistry.get(hash);
        handler.onFontGetFontExtentsFuncT(new FontT(References.get(font, false)), fontData, new FontExtentsT(References.get(extents, false)));
    }
    
    public static void cbFontGetNominalGlyphFuncT(MemoryAddress font, MemoryAddress fontData, MemoryAddress unicode, MemoryAddress glyph, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetNominalGlyphFuncT) signalRegistry.get(hash);
        handler.onFontGetNominalGlyphFuncT(new FontT(References.get(font, false)), fontData, CodepointT.fromValue(unicode), CodepointT.fromValue(glyph));
    }
    
    public static void cbUnicodeDecomposeFuncT(MemoryAddress ufuncs, MemoryAddress ab, MemoryAddress a, MemoryAddress b, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (UnicodeDecomposeFuncT) signalRegistry.get(hash);
        handler.onUnicodeDecomposeFuncT(new UnicodeFuncsT(References.get(ufuncs, false)), CodepointT.fromValue(ab), CodepointT.fromValue(a), CodepointT.fromValue(b));
    }
    
    public static void cbUnicodeCombiningClassFuncT(MemoryAddress ufuncs, MemoryAddress unicode, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (UnicodeCombiningClassFuncT) signalRegistry.get(hash);
        handler.onUnicodeCombiningClassFuncT(new UnicodeFuncsT(References.get(ufuncs, false)), CodepointT.fromValue(unicode));
    }
    
    public static void cbFontGetGlyphShapeFuncT(MemoryAddress font, MemoryAddress fontData, MemoryAddress glyph, MemoryAddress drawFuncs, MemoryAddress drawData, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetGlyphShapeFuncT) signalRegistry.get(hash);
        handler.onFontGetGlyphShapeFuncT(new FontT(References.get(font, false)), fontData, CodepointT.fromValue(glyph), new DrawFuncsT(References.get(drawFuncs, false)), drawData);
    }
    
    public static void cbDrawCubicToFuncT(MemoryAddress dfuncs, MemoryAddress drawData, MemoryAddress st, float control1X, float control1Y, float control2X, float control2Y, float toX, float toY, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DrawCubicToFuncT) signalRegistry.get(hash);
        handler.onDrawCubicToFuncT(new DrawFuncsT(References.get(dfuncs, false)), drawData, new DrawStateT(References.get(st, false)), control1X, control1Y, control2X, control2Y, toX, toY);
    }
    
    public static void cbUnicodeMirroringFuncT(MemoryAddress ufuncs, MemoryAddress unicode, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (UnicodeMirroringFuncT) signalRegistry.get(hash);
        handler.onUnicodeMirroringFuncT(new UnicodeFuncsT(References.get(ufuncs, false)), CodepointT.fromValue(unicode));
    }
    
    public static void cbFontGetGlyphExtentsFuncT(MemoryAddress font, MemoryAddress fontData, MemoryAddress glyph, MemoryAddress extents, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetGlyphExtentsFuncT) signalRegistry.get(hash);
        handler.onFontGetGlyphExtentsFuncT(new FontT(References.get(font, false)), fontData, CodepointT.fromValue(glyph), new GlyphExtentsT(References.get(extents, false)));
    }
    
    public static void cbFontGetGlyphFromNameFuncT(MemoryAddress font, MemoryAddress fontData, MemoryAddress name, int len, MemoryAddress glyph, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetGlyphFromNameFuncT) signalRegistry.get(hash);
        handler.onFontGetGlyphFromNameFuncT(new FontT(References.get(font, false)), fontData, null, len, CodepointT.fromValue(glyph));
    }
    
    public static void cbFontGetGlyphFuncT(MemoryAddress font, MemoryAddress fontData, MemoryAddress unicode, MemoryAddress variationSelector, MemoryAddress glyph, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetGlyphFuncT) signalRegistry.get(hash);
        handler.onFontGetGlyphFuncT(new FontT(References.get(font, false)), fontData, CodepointT.fromValue(unicode), CodepointT.fromValue(variationSelector), CodepointT.fromValue(glyph));
    }
    
    public static void cbUnicodeDecomposeCompatibilityFuncT(MemoryAddress ufuncs, MemoryAddress u, MemoryAddress decomposed, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (UnicodeDecomposeCompatibilityFuncT) signalRegistry.get(hash);
        handler.onUnicodeDecomposeCompatibilityFuncT(new UnicodeFuncsT(References.get(ufuncs, false)), CodepointT.fromValue(u), CodepointT.fromValue(decomposed));
    }
    
    public static void cbFontGetVariationGlyphFuncT(MemoryAddress font, MemoryAddress fontData, MemoryAddress unicode, MemoryAddress variationSelector, MemoryAddress glyph, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetVariationGlyphFuncT) signalRegistry.get(hash);
        handler.onFontGetVariationGlyphFuncT(new FontT(References.get(font, false)), fontData, CodepointT.fromValue(unicode), CodepointT.fromValue(variationSelector), CodepointT.fromValue(glyph));
    }
    
    public static void cbFontGetGlyphKerningFuncT(MemoryAddress font, MemoryAddress fontData, MemoryAddress firstGlyph, MemoryAddress secondGlyph, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetGlyphKerningFuncT) signalRegistry.get(hash);
        handler.onFontGetGlyphKerningFuncT(new FontT(References.get(font, false)), fontData, CodepointT.fromValue(firstGlyph), CodepointT.fromValue(secondGlyph));
    }
    
    public static void cbFontGetGlyphNameFuncT(MemoryAddress font, MemoryAddress fontData, MemoryAddress glyph, MemoryAddress name, int size, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetGlyphNameFuncT) signalRegistry.get(hash);
        handler.onFontGetGlyphNameFuncT(new FontT(References.get(font, false)), fontData, CodepointT.fromValue(glyph), null, size);
    }
    
    public static void cbDrawLineToFuncT(MemoryAddress dfuncs, MemoryAddress drawData, MemoryAddress st, float toX, float toY, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DrawLineToFuncT) signalRegistry.get(hash);
        handler.onDrawLineToFuncT(new DrawFuncsT(References.get(dfuncs, false)), drawData, new DrawStateT(References.get(st, false)), toX, toY);
    }
    
    public static void cbFontGetGlyphAdvancesFuncT(MemoryAddress font, MemoryAddress fontData, int count, MemoryAddress firstGlyph, int glyphStride, MemoryAddress firstAdvance, int advanceStride, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetGlyphAdvancesFuncT) signalRegistry.get(hash);
        handler.onFontGetGlyphAdvancesFuncT(new FontT(References.get(font, false)), fontData, count, CodepointT.fromValue(firstGlyph), glyphStride, PositionT.fromValue(firstAdvance), advanceStride);
    }
    
    public static void cbFontGetNominalGlyphsFuncT(MemoryAddress font, MemoryAddress fontData, int count, MemoryAddress firstUnicode, int unicodeStride, MemoryAddress firstGlyph, int glyphStride, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetNominalGlyphsFuncT) signalRegistry.get(hash);
        handler.onFontGetNominalGlyphsFuncT(new FontT(References.get(font, false)), fontData, count, CodepointT.fromValue(firstUnicode), unicodeStride, CodepointT.fromValue(firstGlyph), glyphStride);
    }
    
    public static void cbReferenceTableFuncT(MemoryAddress face, MemoryAddress tag, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (ReferenceTableFuncT) signalRegistry.get(hash);
        handler.onReferenceTableFuncT(new FaceT(References.get(face, false)), TagT.fromValue(tag));
    }
    
    public static void cbDrawMoveToFuncT(MemoryAddress dfuncs, MemoryAddress drawData, MemoryAddress st, float toX, float toY, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DrawMoveToFuncT) signalRegistry.get(hash);
        handler.onDrawMoveToFuncT(new DrawFuncsT(References.get(dfuncs, false)), drawData, new DrawStateT(References.get(st, false)), toX, toY);
    }
    
    public static void cbFontGetGlyphContourPointFuncT(MemoryAddress font, MemoryAddress fontData, MemoryAddress glyph, int pointIndex, MemoryAddress x, MemoryAddress y, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetGlyphContourPointFuncT) signalRegistry.get(hash);
        handler.onFontGetGlyphContourPointFuncT(new FontT(References.get(font, false)), fontData, CodepointT.fromValue(glyph), pointIndex, PositionT.fromValue(x), PositionT.fromValue(y));
    }
    
    public static void cbFontGetGlyphOriginFuncT(MemoryAddress font, MemoryAddress fontData, MemoryAddress glyph, MemoryAddress x, MemoryAddress y, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontGetGlyphOriginFuncT) signalRegistry.get(hash);
        handler.onFontGetGlyphOriginFuncT(new FontT(References.get(font, false)), fontData, CodepointT.fromValue(glyph), PositionT.fromValue(x), PositionT.fromValue(y));
    }
    
}
