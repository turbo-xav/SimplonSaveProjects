CREATE SEQUENCE public.aliment_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public.aliment_id_seq
    OWNER TO postgres;
	
CREATE SEQUENCE public.category_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public.category_id_seq
    OWNER TO postgres;
	
-- Table: public.category

-- DROP TABLE public.category;

CREATE TABLE public.category
(
    id integer NOT NULL DEFAULT nextval('category_id_seq'::regclass),
    name character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT category_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.category
    OWNER to postgres;
	
-- Table: public.foods

-- DROP TABLE public.foods;

CREATE TABLE public.foods
(
    id integer NOT NULL DEFAULT nextval('aliment_id_seq'::regclass),
    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    protein integer,
    glucid integer,
    lipid integer,
    id_category integer,
    CONSTRAINT aliment_pkey PRIMARY KEY (id),
    CONSTRAINT fk_id_cat FOREIGN KEY (id_category)
        REFERENCES public.category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.foods
    OWNER to postgres;

-- Index: fki_fk_id_cat

-- DROP INDEX public.fki_fk_id_cat;

CREATE INDEX fki_fk_id_cat
    ON public.foods USING btree
    (id_category)
    TABLESPACE pg_default;
	
