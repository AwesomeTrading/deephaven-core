/**
 * Copyright (c) 2016-2023 Deephaven Data Labs and Patent Pending
 */
/*
 * ---------------------------------------------------------------------------------------------------------------------
 * AUTO-GENERATED CLASS - DO NOT EDIT MANUALLY - for any changes edit CharTransfer and regenerate
 * ---------------------------------------------------------------------------------------------------------------------
 */
package io.deephaven.parquet.table.transfer;

import io.deephaven.chunk.ByteChunk;
import io.deephaven.chunk.attributes.Values;
import io.deephaven.engine.table.ColumnSource;
import org.jetbrains.annotations.NotNull;

class ByteTransfer extends IntCastablePrimitiveTransfer<ByteChunk<Values>> {

    public ByteTransfer(@NotNull final ColumnSource<?> columnSource, final int targetSize) {
        super(columnSource, targetSize);
    }

    @Override
    public void copyAllFromChunkToBuffer() {
        for (int chunkIdx = 0; chunkIdx < chunk.size(); ++chunkIdx) {
            buffer.put(chunk.get(chunkIdx));
        }
    }
}
