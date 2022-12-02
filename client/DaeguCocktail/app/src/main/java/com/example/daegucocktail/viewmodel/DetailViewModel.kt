package com.example.daegucocktail.viewmodel

import androidx.lifecycle.ViewModel
import com.example.daegucocktail.data.Cocktail

class DetailViewModel : ViewModel() {
    val list = listOf(Cocktail(
        id = 0,
        image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTFLSUHsk4DD5JvyMuHUb9nlHAzcQq1q7cuwg&usqp=CAU",
        title = "가미가제(Kamikaze)",
        desc = "잔 20000원 [잔-3온스 칵테일(90ml), 보드카 35 ml, 트리플 섹 15 ml, 라임주스 15 ml] 일본식 이름이지만 미국이 원산이며 근래에 개봉된 영화 '칵테일로 우리 나라에 많이 알려져 있다. 보드카의 무색,무취,무미한 특성 때문에 마실 때에는 부드러우나 마시고 난 후 짜릿한 취기를 느끼게 한다. 쉐이커에 얼음과 재료를 넣고 가볍게 흔들어 잔에 따른다."
    ), Cocktail(
        id = 1,
        image = "https://cocktail-bucket.s3.ap-northeast-2.amazonaws.com/TB_COCK_MASTER/24.%EA%B0%93%ED%8C%8C%EB%8D%94.jpg",
        title = "갓 파더(God Father)",
        desc = "잔 25000원 [잔-6온스 락(180ml), 스카치위스키 40 ml, 아마레또 20 ml] 스카치위스키의 향과 아모드 리큐르인 아마에또향이 잘 어울어진 칵테일이다. 스카치위스키를 보드카로 바꾸면 (갓 마더(God Mother))로 이름이 달라진다. 잔에 얼음과 재료를 넣고 두세번 젓는다."
    ), Cocktail(
        id = 2,
        image = "https://upload.wikimedia.org/wikipedia/commons/1/15/Godlen-Dream_Mixed_Drink_Cocktail_%282360538105%29.jpg",
        title = "골든 드림(Golden Dream)",
        desc = "잔 28000원 [잔-4온스 칵테일(120ml), 갈리아노 - 30 ml, 트리플 섹 - 15ml, 오렌지주스 - 15ml, 크림 - 15ml] 갈리아노 베이스 칵테일 중에서 매우 유명한 칵테일이다. 쉐이커에 얼음과 재료를 넣고 잘 흔들어 잔에 따른다."
    ), Cocktail(
        id = 3,
        image = "https://dishesdelish.com/wp-content/uploads/2020/03/Grasshopper-cocktail-closeup-lighter-1.jpg.webp",
        title = "글라스 호퍼(Grass hopper)",
        desc = "잔 25000원 [잔-4온스 칵테일(120ml), 크레임 드 카카오(화이트) - 20ml, 크레임 드 멘트(그린) - 20ml, 생크림 - 20ml] 아름다운 녹색을 띠고 있어 붙여진 이름이다. 페퍼민트와 생크림이 만들어내는 상쾌한 단맛과 카카오의 향기로운 풍미가 믹스되어 감칠맛도 부드러워 식후의 칵테일로 유명하다. 원래는 섞지 않고 푸스카페 스타일이었다."
    ), Cocktail(
        id = 4,
        image = "https://w.namu.la/s/c562c5a01fa35345bc8653d32e986c1911fc57d378eeb90e7553258c02993a5102ab4d7e126aedf0232576bc6ea4b8e26af497e30d80460ea446bdaab3bf4a3f7feadb8dab9227709449c6e30cd52d08d669e3731827b36b436bbc56b41a203a7e2706e8bd2a82e7535bb318f031f55a",
        title = "네그로니(Negroni)",
        desc = "잔 20000원 [잔-6온스 락(180ml), 드라이 진 - 30ml, 캄파리 - 30ml, 스위트 버머스 - 30ml, 슬라이스 레몬 - 1조각] 이탈리아의 귀족 카미로 네그로니 백작이 피렌체의 카소니라는 레스토라에서 이 칵테일을 식전주로 좋아했기 때문이었다고 한다. 그 후 1962년 이 레스토랑의 바텐더가 백작의 허가를 얻어 발표한 것이다. 캄파리의 씁쓸한 맛에 단맛의 버머스가 곁들여져 우아한 백작의 식전주로 애음되고 있다."
    ))
}