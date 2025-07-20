show tables;

create table kiosk (
  idx  int not null auto_increment primary key,	/* 고유번호 */
  part varchar(20) not null,		/* 상품분류 */
  product varchar(30) not null,	/* 상품명 */
  detail  varchar(50) not null,	/* 상품 간단설명 */
  content text,									/* 상품 상세설명 */
  calorie int default 0,				/* 칼로리 */
  image varchar(50) not null,	/* 상품이미지(2개, 큰이미지, 작은이미지(_s) */
  price	int not null					/* 상품 가격 */
);

desc kiosk;
select *from kiosk;




select *from kiosk where product = '오리지널스 메이플 갈릭' or idx = 12;
select *from kiosk where part = '프리밍' or idx = 5;
delete table kiosk;

delete from kiosk where idx = 18;

update kiosk set image = 'C:\Users\khm\eclipse-workspace\kiosk\src\burgerking\Images\오리지널스 뉴욕 스테이크.jpg' where idx = 11;

update kiosk set part= '프리미엄' where idx = 6;
