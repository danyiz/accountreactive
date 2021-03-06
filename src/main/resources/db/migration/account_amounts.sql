-- public.account_amounts definition

-- Drop table

-- DROP TABLE public.account_amounts;

CREATE TABLE Account.account_amounts (
	uuid int8 NOT NULL GENERATED BY DEFAULT AS IDENTITY,
	account_number int8 NOT NULL,
	amount_type varchar NOT NULL,
	amount_value float4 NOT NULL,
	value_date date NOT NULL,
	amount_wash float4 NOT NULL
);
CREATE INDEX account_amounts_account_number_idx ON public.account_amounts USING btree (account_number, amount_type, value_date DESC);