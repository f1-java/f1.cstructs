// Generated by jextract

package f1.cstructs.year2021;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class CarTelemetryData {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("m_speed"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_throttle"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_steer"),
        Constants$root.C_FLOAT$LAYOUT.withName("m_brake"),
        Constants$root.C_CHAR$LAYOUT.withName("m_clutch"),
        Constants$root.C_CHAR$LAYOUT.withName("m_gear"),
        Constants$root.C_SHORT$LAYOUT.withName("m_engineRPM"),
        Constants$root.C_CHAR$LAYOUT.withName("m_drs"),
        Constants$root.C_CHAR$LAYOUT.withName("m_revLightsPercent"),
        Constants$root.C_SHORT$LAYOUT.withName("m_revLightsBitValue"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_SHORT$LAYOUT).withName("m_brakesTemperature"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("m_tyresSurfaceTemperature"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("m_tyresInnerTemperature"),
        Constants$root.C_SHORT$LAYOUT.withName("m_engineTemperature"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("m_tyresPressure"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("m_surfaceType")
    ).withName("CarTelemetryData");
    public static MemoryLayout $LAYOUT() {
        return CarTelemetryData.$struct$LAYOUT;
    }
    static final VarHandle m_speed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_speed"));
    public static VarHandle m_speed$VH() {
        return CarTelemetryData.m_speed$VH;
    }
    public static short m_speed$get(MemorySegment seg) {
        return (short)CarTelemetryData.m_speed$VH.get(seg);
    }
    public static void m_speed$set( MemorySegment seg, short x) {
        CarTelemetryData.m_speed$VH.set(seg, x);
    }
    public static short m_speed$get(MemorySegment seg, long index) {
        return (short)CarTelemetryData.m_speed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_speed$set(MemorySegment seg, long index, short x) {
        CarTelemetryData.m_speed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_throttle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_throttle"));
    public static VarHandle m_throttle$VH() {
        return CarTelemetryData.m_throttle$VH;
    }
    public static float m_throttle$get(MemorySegment seg) {
        return (float)CarTelemetryData.m_throttle$VH.get(seg);
    }
    public static void m_throttle$set( MemorySegment seg, float x) {
        CarTelemetryData.m_throttle$VH.set(seg, x);
    }
    public static float m_throttle$get(MemorySegment seg, long index) {
        return (float)CarTelemetryData.m_throttle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_throttle$set(MemorySegment seg, long index, float x) {
        CarTelemetryData.m_throttle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_steer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_steer"));
    public static VarHandle m_steer$VH() {
        return CarTelemetryData.m_steer$VH;
    }
    public static float m_steer$get(MemorySegment seg) {
        return (float)CarTelemetryData.m_steer$VH.get(seg);
    }
    public static void m_steer$set( MemorySegment seg, float x) {
        CarTelemetryData.m_steer$VH.set(seg, x);
    }
    public static float m_steer$get(MemorySegment seg, long index) {
        return (float)CarTelemetryData.m_steer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_steer$set(MemorySegment seg, long index, float x) {
        CarTelemetryData.m_steer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_brake$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_brake"));
    public static VarHandle m_brake$VH() {
        return CarTelemetryData.m_brake$VH;
    }
    public static float m_brake$get(MemorySegment seg) {
        return (float)CarTelemetryData.m_brake$VH.get(seg);
    }
    public static void m_brake$set( MemorySegment seg, float x) {
        CarTelemetryData.m_brake$VH.set(seg, x);
    }
    public static float m_brake$get(MemorySegment seg, long index) {
        return (float)CarTelemetryData.m_brake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_brake$set(MemorySegment seg, long index, float x) {
        CarTelemetryData.m_brake$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_clutch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_clutch"));
    public static VarHandle m_clutch$VH() {
        return CarTelemetryData.m_clutch$VH;
    }
    public static byte m_clutch$get(MemorySegment seg) {
        return (byte)CarTelemetryData.m_clutch$VH.get(seg);
    }
    public static void m_clutch$set( MemorySegment seg, byte x) {
        CarTelemetryData.m_clutch$VH.set(seg, x);
    }
    public static byte m_clutch$get(MemorySegment seg, long index) {
        return (byte)CarTelemetryData.m_clutch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_clutch$set(MemorySegment seg, long index, byte x) {
        CarTelemetryData.m_clutch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_gear$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_gear"));
    public static VarHandle m_gear$VH() {
        return CarTelemetryData.m_gear$VH;
    }
    public static byte m_gear$get(MemorySegment seg) {
        return (byte)CarTelemetryData.m_gear$VH.get(seg);
    }
    public static void m_gear$set( MemorySegment seg, byte x) {
        CarTelemetryData.m_gear$VH.set(seg, x);
    }
    public static byte m_gear$get(MemorySegment seg, long index) {
        return (byte)CarTelemetryData.m_gear$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_gear$set(MemorySegment seg, long index, byte x) {
        CarTelemetryData.m_gear$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_engineRPM$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_engineRPM"));
    public static VarHandle m_engineRPM$VH() {
        return CarTelemetryData.m_engineRPM$VH;
    }
    public static short m_engineRPM$get(MemorySegment seg) {
        return (short)CarTelemetryData.m_engineRPM$VH.get(seg);
    }
    public static void m_engineRPM$set( MemorySegment seg, short x) {
        CarTelemetryData.m_engineRPM$VH.set(seg, x);
    }
    public static short m_engineRPM$get(MemorySegment seg, long index) {
        return (short)CarTelemetryData.m_engineRPM$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_engineRPM$set(MemorySegment seg, long index, short x) {
        CarTelemetryData.m_engineRPM$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_drs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_drs"));
    public static VarHandle m_drs$VH() {
        return CarTelemetryData.m_drs$VH;
    }
    public static byte m_drs$get(MemorySegment seg) {
        return (byte)CarTelemetryData.m_drs$VH.get(seg);
    }
    public static void m_drs$set( MemorySegment seg, byte x) {
        CarTelemetryData.m_drs$VH.set(seg, x);
    }
    public static byte m_drs$get(MemorySegment seg, long index) {
        return (byte)CarTelemetryData.m_drs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_drs$set(MemorySegment seg, long index, byte x) {
        CarTelemetryData.m_drs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_revLightsPercent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_revLightsPercent"));
    public static VarHandle m_revLightsPercent$VH() {
        return CarTelemetryData.m_revLightsPercent$VH;
    }
    public static byte m_revLightsPercent$get(MemorySegment seg) {
        return (byte)CarTelemetryData.m_revLightsPercent$VH.get(seg);
    }
    public static void m_revLightsPercent$set( MemorySegment seg, byte x) {
        CarTelemetryData.m_revLightsPercent$VH.set(seg, x);
    }
    public static byte m_revLightsPercent$get(MemorySegment seg, long index) {
        return (byte)CarTelemetryData.m_revLightsPercent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_revLightsPercent$set(MemorySegment seg, long index, byte x) {
        CarTelemetryData.m_revLightsPercent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_revLightsBitValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_revLightsBitValue"));
    public static VarHandle m_revLightsBitValue$VH() {
        return CarTelemetryData.m_revLightsBitValue$VH;
    }
    public static short m_revLightsBitValue$get(MemorySegment seg) {
        return (short)CarTelemetryData.m_revLightsBitValue$VH.get(seg);
    }
    public static void m_revLightsBitValue$set( MemorySegment seg, short x) {
        CarTelemetryData.m_revLightsBitValue$VH.set(seg, x);
    }
    public static short m_revLightsBitValue$get(MemorySegment seg, long index) {
        return (short)CarTelemetryData.m_revLightsBitValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_revLightsBitValue$set(MemorySegment seg, long index, short x) {
        CarTelemetryData.m_revLightsBitValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment m_brakesTemperature$slice(MemorySegment seg) {
        return seg.asSlice(22, 8);
    }
    public static MemorySegment m_tyresSurfaceTemperature$slice(MemorySegment seg) {
        return seg.asSlice(30, 4);
    }
    public static MemorySegment m_tyresInnerTemperature$slice(MemorySegment seg) {
        return seg.asSlice(34, 4);
    }
    static final VarHandle m_engineTemperature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_engineTemperature"));
    public static VarHandle m_engineTemperature$VH() {
        return CarTelemetryData.m_engineTemperature$VH;
    }
    public static short m_engineTemperature$get(MemorySegment seg) {
        return (short)CarTelemetryData.m_engineTemperature$VH.get(seg);
    }
    public static void m_engineTemperature$set( MemorySegment seg, short x) {
        CarTelemetryData.m_engineTemperature$VH.set(seg, x);
    }
    public static short m_engineTemperature$get(MemorySegment seg, long index) {
        return (short)CarTelemetryData.m_engineTemperature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_engineTemperature$set(MemorySegment seg, long index, short x) {
        CarTelemetryData.m_engineTemperature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment m_tyresPressure$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    public static MemorySegment m_surfaceType$slice(MemorySegment seg) {
        return seg.asSlice(56, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


