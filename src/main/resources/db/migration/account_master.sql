-- public.account_master definition

-- Drop table

-- DROP TABLE public.account_master;

CREATE TABLE Account.account_master (
	account_number int8 NULL,
	accont_type varchar NOT NULL,
	opening_date date NOT NULL,
	uuid int8 NOT NULL GENERATED ALWAYS AS IDENTITY
);