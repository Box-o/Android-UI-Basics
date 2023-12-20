package net.flow9.thisiskotlin.uibasic


data class Testdata(val familyname: String, val lastname: String, val id: String, val pw: String)


//장바구니 비어있는 리스트인데 추가/삭제 가능
val jangBaGuNiList:MutableList<Testdata> = mutableListOf(
    Testdata("김", "철수", "iron", "iron"),
    Testdata("홍", "길동", "father", "father"),
    Testdata("잡스", "스티븐", "steven", "steven")
)
