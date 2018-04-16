package org.buffer.android.counterview

enum class CounterMode(val id: String) {

    DESCENDING("descending"), ASCENDING("ascending"), STANDARD("standard");

    companion object {
        fun fromId(id: String): CounterMode {
            return when (id) {
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