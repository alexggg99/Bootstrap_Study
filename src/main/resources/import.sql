insert into role(id, authority) values (1, 'USER')
insert into role(id, authority) values (2, 'ADMIN')

insert into user(id, username, password, first_name, last_name, role_id, email) values (1, 'admin', '123', 'Alex', 'Ivanov', 2, 'admin@admin.ru')
insert into user(id, username, password, first_name, last_name, role_id, email) values (2, 'user', '123', 'Sergey', 'Popov', 1, 'user@user.ru')

insert into categories(id, name) values (1, 'Smartphones')
insert into categories(id, name) values (2, 'Smart-TV')

insert into products(id, title, category_id, price, spec, image_url, stars) values (1, 'Nexus 5 32G', 1, 362, 'Android 5.1, цветной IPS дисплей, Диагональ 4.95 дюйм, Фотокамера 8 млн пикс, аккумулятора 2300 мА?ч', '/img/Nexus_5.jpg', 3.5)
insert into products(id, title, category_id, price, spec, image_url, stars) values (2, 'Nexus 5X 32G', 1, 242, 'Android 6.0, цветной IPS дисплей, Диагональ 5.2 дюйм, Фотокамера 12.3 млн пикс, аккумулятора 2700 мА?ч', '/img/nexus_5X_32.jpeg', 2)
insert into products(id, title, category_id, price, spec, image_url, stars) values (3, 'Nexus 6 32G', 1, 380, 'Android 6.0, цветной IPS дисплей, Диагональ 4.7 дюйм, Фотокамера 12.3 млн пикс, аккумулятора 3450 мА?ч', '/img/nexus_6_32.jpeg', 5)

insert into comments(id, create_date, author, comment, product_id) values (1, '2014-02-02', 'Алексей', 'Купил в штатах на смену Motorola Nexus 6, которым пользовался около месяца. У 6p острые грани и они режут руку при использовании, не комфортно лежит в руке. Материал корпуса дешевый и не вызывает ощущение премиальности. ', 1)
insert into comments(id, create_date, author, comment, product_id) values (2, '2015-09-10', 'Liza', 'как и у всех смартфонов, ну или почти у всех, так это работа батареи, мало держит батарею, блин товарищи производители напихали всего самого самого, а нормальной емкости для смарта расширить не могут.', 2)
insert into comments(id, create_date, author, comment, product_id) values (3, '2015-10-22', 'Дмитрий Д', 'Эта такой аппарат... да это такой смартфон... Да вообще супер флагман)))))))', 2)
insert into comments(id, create_date, author, comment, product_id) values (4, '2015-11-23', 'Катя', 'как и у всех смартфонов, ну или почти у всех, так это работа батареи, мало держит батарею, блин товарищи производители напихали всего самого самого', 2)