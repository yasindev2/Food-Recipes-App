package uz.yasindev.foodapp

object LocalStorage {
    private val data = ArrayList<FoodModel>()


    fun getFoods(): ArrayList<FoodModel> {
        data.clear()

        data.add(
            FoodModel(
                1,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmLeQHTUKkTZcrNgMIfSx5fTZfbTWPNcQD-w&s",
                "Palov",
                20
            )
        )
        data.add(
            FoodModel(
                2,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6Psm6bU0MHeT2gcNeG_pgzsZ6N6l-k7BlLA&s",
                "Chicken",
                30
            )
        )
        data.add(
            FoodModel(
                3,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQoV8IPkjdH63WeqXnUEEFl5SNK43FPMoPFBw&s",
                "Pizza",
                40
            )
        )

        data.add(
            FoodModel(
                4,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTPUtaqxuGYSWad4gAfi6klWBdmEYPn47Jf7A&s",
                "Fish",
                20
            )
        )
        data.add(
            FoodModel(
                5,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRh15KgebvNHo3h_zH1_TWeyw38BdCPFwpng&s",
                "Salad",
                30
            )
        )
        data.add(
            FoodModel(
                6,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjJAfppdNTp8GOYMmMA_HZypacPm5hGuz0XA&s",
                "Bread",
                40
            )
        )

        data.add(
            FoodModel(
                7,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJLpBM9h2DTJof01NtcTs_GwLKxbuMYzNY6Q&s",
                "Kabob",
                20
            )
        )
        data.add(
            FoodModel(
                8,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIteVDfjzdXYAYzXz5ao-wqfPE4khYGTCeSA&s",
                "Stake",
                30
            )
        )
        data.add(
            FoodModel(
                9,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJaE6QkL4NE0_9eOoAjAP2Y5MztJfehUQnnQ&s",
                "Cookies",
                40
            )
        )


        return data

    }



}