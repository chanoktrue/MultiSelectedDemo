package com.chanoktrue.multiselecteddemo

data class ListItem(
    val title: String = "",
    val isSelected: Boolean = false
){
    fun createData(): List<ListItem> {
        return listOf(
            ListItem(title = "AAA", isSelected = false),
            ListItem(title = "BBB", isSelected = false),
            ListItem(title = "CCC", isSelected = true),
            ListItem(title = "DDD", isSelected = false),
            ListItem(title = "DDD", isSelected = false) ,
        )
    }
}
