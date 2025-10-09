package com.example.firstapp.lec5.datasource

import com.example.firstapp.lec5.model.GridItem

object GridDataSource {
    
    fun getGridItems(): List<GridItem> {
        return listOf(
            GridItem(
                id = 1,
                title = "Nature Landscape",
                imageUrl = "https://images.unsplash.com/photo-1506905925346-21bda4d32df4?w=400&h=400&fit=crop",
                description = "Beautiful mountain landscape"
            ),
            GridItem(
                id = 2,
                title = "Ocean View",
                imageUrl = "https://images.unsplash.com/photo-1439066615861-d1af74d74000?w=400&h=400&fit=crop",
                description = "Stunning ocean sunset"
            ),
            GridItem(
                id = 3,
                title = "City Skyline",
                imageUrl = "https://images.unsplash.com/photo-1449824913935-59a10b8d2000?w=400&h=400&fit=crop",
                description = "Modern city architecture"
            ),
            GridItem(
                id = 4,
                title = "Forest Path",
                imageUrl = "https://images.unsplash.com/photo-1441974231531-c6227db76b6e?w=400&h=400&fit=crop",
                description = "Peaceful forest trail"
            ),
            GridItem(
                id = 5,
                title = "Desert Dunes",
                imageUrl = "https://images.unsplash.com/photo-1509316975850-ff9c5deb0cd9?w=400&h=400&fit=crop",
                description = "Golden sand dunes"
            ),
            GridItem(
                id = 6,
                title = "Tropical Beach",
                imageUrl = "https://images.unsplash.com/photo-1507525428034-b723cf961d3e?w=400&h=400&fit=crop",
                description = "Crystal clear waters"
            ),
            GridItem(
                id = 7,
                title = "Autumn Forest",
                imageUrl = "https://images.unsplash.com/photo-1507041957456-9c397ce39c97?w=400&h=400&fit=crop",
                description = "Colorful fall foliage"
            ),
            GridItem(
                id = 8,
                title = "Urban Street",
                imageUrl = "https://images.unsplash.com/photo-1477959858617-67f85cf4f1df?w=400&h=400&fit=crop",
                description = "Busy city street"
            ),
            GridItem(
                id = 9,
                title = "Starry Night",
                imageUrl = "https://images.unsplash.com/photo-1419242902214-272b3f66ee7a?w=400&h=400&fit=crop",
                description = "Night sky with stars"
            ),
            GridItem(
                id = 10,
                title = "Flower Garden",
                imageUrl = "https://images.unsplash.com/photo-1416879595882-3373a0480b5b?w=400&h=400&fit=crop",
                description = "Beautiful flower garden"
            )
        )
    }
}
