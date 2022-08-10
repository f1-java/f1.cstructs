// Generated by jextract

package f1.cstructs.year2022;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PacketFinalClassificationData {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("m_packetFormat"),
            Constants$root.C_CHAR$LAYOUT.withName("m_gameMajorVersion"),
            Constants$root.C_CHAR$LAYOUT.withName("m_gameMinorVersion"),
            Constants$root.C_CHAR$LAYOUT.withName("m_packetVersion"),
            Constants$root.C_CHAR$LAYOUT.withName("m_packetId"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("m_sessionUID"),
            Constants$root.C_FLOAT$LAYOUT.withName("m_sessionTime"),
            Constants$root.C_INT$LAYOUT.withName("m_frameIdentifier"),
            Constants$root.C_CHAR$LAYOUT.withName("m_playerCarIndex"),
            Constants$root.C_CHAR$LAYOUT.withName("m_secondaryPlayerCarIndex")
        ).withName("m_header"),
        Constants$root.C_CHAR$LAYOUT.withName("m_numCars"),
        MemoryLayout.sequenceLayout(22, MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("m_position"),
            Constants$root.C_CHAR$LAYOUT.withName("m_numLaps"),
            Constants$root.C_CHAR$LAYOUT.withName("m_gridPosition"),
            Constants$root.C_CHAR$LAYOUT.withName("m_points"),
            Constants$root.C_CHAR$LAYOUT.withName("m_numPitStops"),
            Constants$root.C_CHAR$LAYOUT.withName("m_resultStatus"),
            Constants$root.C_INT$LAYOUT.withName("m_bestLapTimeInMS"),
            Constants$root.C_DOUBLE$LAYOUT.withName("m_totalRaceTime"),
            Constants$root.C_CHAR$LAYOUT.withName("m_penaltiesTime"),
            Constants$root.C_CHAR$LAYOUT.withName("m_numPenalties"),
            Constants$root.C_CHAR$LAYOUT.withName("m_numTyreStints"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("m_tyreStintsActual"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("m_tyreStintsVisual"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("m_tyreStintsEndLaps")
        ).withName("FinalClassificationData")).withName("m_classificationData")
    ).withName("PacketFinalClassificationData");
    public static MemoryLayout $LAYOUT() {
        return PacketFinalClassificationData.$struct$LAYOUT;
    }
    public static MemorySegment m_header$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    static final VarHandle m_numCars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_numCars"));
    public static VarHandle m_numCars$VH() {
        return PacketFinalClassificationData.m_numCars$VH;
    }
    public static byte m_numCars$get(MemorySegment seg) {
        return (byte)PacketFinalClassificationData.m_numCars$VH.get(seg);
    }
    public static void m_numCars$set( MemorySegment seg, byte x) {
        PacketFinalClassificationData.m_numCars$VH.set(seg, x);
    }
    public static byte m_numCars$get(MemorySegment seg, long index) {
        return (byte)PacketFinalClassificationData.m_numCars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_numCars$set(MemorySegment seg, long index, byte x) {
        PacketFinalClassificationData.m_numCars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment m_classificationData$slice(MemorySegment seg) {
        return seg.asSlice(25, 990);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


