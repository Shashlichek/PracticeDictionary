create table dictionary (
    id uuid not null unique,
    code varchar(50) not null,
    description varchar(50) not null,
    primary key (id)
);

create table data (
    id uuid not null unique,
    dictionary_id uuid not null,
    code varchar(50) not null,
    description varchar(50) not null,
    primary key (id),
    foreign key (dictionary_id) references dictionary(id)
);



