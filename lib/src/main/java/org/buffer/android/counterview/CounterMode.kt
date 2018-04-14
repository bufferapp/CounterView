package org.buffer.android.counterview

enum class CounterMode(val id: Int) {

    DESCENDING(0), ASCENDING(1), STANDARD(2);

    companion object {
        fun fromId(id: Int) {
            when (id) {
                DESCENDING.id -> {
                    DESCENDING
                }
                ASCENDING.id -> {
                    ASCENDING
                }
                STANDARD.id -> {
                    STANDARD
                }
                else -> {
                    throw IllegalArgumentException("The ID: $id isn't currently supported")
                }
            }
        }
    }
}