-- Database: dietetique

-- DROP DATABASE dietetique;

CREATE DATABASE dietetique
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'French_France.1252'
    LC_CTYPE = 'French_France.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
-- Table: public.category

CREATE SEQUENCE public.category_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public.category_id_seq
    OWNER TO postgres;


-- DROP TABLE public.category;

CREATE TABLE public.category
(
    id integer NOT NULL DEFAULT nextval('category_id_seq'::regclass),
    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT category_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.category
    OWNER to postgres;
	
INSERT INTO public.category("name") VALUES ('Viandes');
INSERT INTO public.category("name") VALUES ('Fruits');
INSERT INTO public.category("name") VALUES ('Legumes');