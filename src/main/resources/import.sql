insert into role(id, authority) values (1, 'USER')
insert into role(id, authority) values (2, 'ADMIN')

insert into user(id, username, password, first_name, last_name, role_id, email) values (1, 'admin', '123', 'Alex', 'Ivanov', 2, 'admin@admin.ru')
insert into user(id, username, password, first_name, last_name, role_id, email) values (2, 'user', '123', 'Sergey', 'Popov', 1, 'user@user.ru')

insert into categories(id, name) values (1, 'Smartphones')
insert into categories(id, name) values (2, 'Smart-TV')

insert into products(id, title, category_id, price, spec, image_url, stars) values (1, 'Nexus 5 32G', 1, 362, 'Android 5.1, ������� IPS �������, ��������� 4.95 ����, ���������� 8 ��� ����, ������������ 2300 ��?�', '/img/Nexus_5.jpg', 3.5)
insert into products(id, title, category_id, price, spec, image_url, stars) values (2, 'Nexus 5X 32G', 1, 242, 'Android 6.0, ������� IPS �������, ��������� 5.2 ����, ���������� 12.3 ��� ����, ������������ 2700 ��?�', '/img/nexus_5X_32.jpeg', 2)
insert into products(id, title, category_id, price, spec, image_url, stars) values (3, 'Nexus 6 32G', 1, 380, 'Android 6.0, ������� IPS �������, ��������� 4.7 ����, ���������� 12.3 ��� ����, ������������ 3450 ��?�', '/img/nexus_6_32.jpeg', 5)

insert into comments(id, create_date, author, comment, product_id) values (1, '2014-02-02', '�������', '����� � ������ �� ����� Motorola Nexus 6, ������� ����������� ����� ������. � 6p ������ ����� � ��� ����� ���� ��� �������������, �� ��������� ����� � ����. �������� ������� ������� � �� �������� �������� �������������. ', 1)
insert into comments(id, create_date, author, comment, product_id) values (2, '2015-09-10', 'Liza', '��� � � ���� ����������, �� ��� ����� � ����, ��� ��� ������ �������, ���� ������ �������, ���� �������� ������������� �������� ����� ������ ������, � ���������� ������� ��� ������ ��������� �� �����.', 2)
insert into comments(id, create_date, author, comment, product_id) values (3, '2015-10-22', '������� �', '��� ����� �������... �� ��� ����� ��������... �� ������ ����� �������)))))))', 2)
insert into comments(id, create_date, author, comment, product_id) values (4, '2015-11-23', '����', '��� � � ���� ����������, �� ��� ����� � ����, ��� ��� ������ �������, ���� ������ �������, ���� �������� ������������� �������� ����� ������ ������', 2)