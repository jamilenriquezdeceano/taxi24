--
-- PostgreSQL database dump
--

-- Dumped from database version 13.4
-- Dumped by pg_dump version 13.3

-- Started on 2021-08-14 01:45:23 CDT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 201 (class 1259 OID 16390)
-- Name: conductores; Type: TABLE; Schema: public; Owner: usr_taxi24
--

CREATE TABLE public.conductores (
    id integer NOT NULL,
    nombre character varying(150) NOT NULL,
    paterno character varying(150) NOT NULL,
    materno character varying(150) NOT NULL,
    celular character varying(10) NOT NULL,
    disponibilidad boolean NOT NULL,
    ubicacion integer NOT NULL
);


ALTER TABLE public.conductores OWNER TO usr_taxi24;

--
-- TOC entry 200 (class 1259 OID 16388)
-- Name: conductores_id_seq; Type: SEQUENCE; Schema: public; Owner: usr_taxi24
--

CREATE SEQUENCE public.conductores_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.conductores_id_seq OWNER TO usr_taxi24;

--
-- TOC entry 3279 (class 0 OID 0)
-- Dependencies: 200
-- Name: conductores_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: usr_taxi24
--

ALTER SEQUENCE public.conductores_id_seq OWNED BY public.conductores.id;


--
-- TOC entry 203 (class 1259 OID 16398)
-- Name: pasajeros; Type: TABLE; Schema: public; Owner: usr_taxi24
--

CREATE TABLE public.pasajeros (
    id integer NOT NULL,
    nombre character varying(150) NOT NULL,
    paterno character varying(150) NOT NULL,
    materno character varying(150) NOT NULL,
    celular character varying(10) NOT NULL,
    ubicacion integer NOT NULL
);


ALTER TABLE public.pasajeros OWNER TO usr_taxi24;

--
-- TOC entry 202 (class 1259 OID 16396)
-- Name: pasajero_id_seq; Type: SEQUENCE; Schema: public; Owner: usr_taxi24
--

CREATE SEQUENCE public.pasajero_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pasajero_id_seq OWNER TO usr_taxi24;

--
-- TOC entry 3280 (class 0 OID 0)
-- Dependencies: 202
-- Name: pasajero_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: usr_taxi24
--

ALTER SEQUENCE public.pasajero_id_seq OWNED BY public.pasajeros.id;


--
-- TOC entry 205 (class 1259 OID 16414)
-- Name: viajes; Type: TABLE; Schema: public; Owner: usr_taxi24
--

CREATE TABLE public.viajes (
    id integer NOT NULL,
    fecha date NOT NULL,
    hora_inicio time without time zone NOT NULL,
    hora_fin time without time zone NOT NULL,
    estatus character varying(25) NOT NULL,
    id_pasajero integer NOT NULL,
    id_conductor integer NOT NULL
);


ALTER TABLE public.viajes OWNER TO usr_taxi24;

--
-- TOC entry 204 (class 1259 OID 16412)
-- Name: viajes_id_seq; Type: SEQUENCE; Schema: public; Owner: usr_taxi24
--

CREATE SEQUENCE public.viajes_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.viajes_id_seq OWNER TO usr_taxi24;

--
-- TOC entry 3281 (class 0 OID 0)
-- Dependencies: 204
-- Name: viajes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: usr_taxi24
--

ALTER SEQUENCE public.viajes_id_seq OWNED BY public.viajes.id;


--
-- TOC entry 3127 (class 2604 OID 16393)
-- Name: conductores id; Type: DEFAULT; Schema: public; Owner: usr_taxi24
--

ALTER TABLE ONLY public.conductores ALTER COLUMN id SET DEFAULT nextval('public.conductores_id_seq'::regclass);


--
-- TOC entry 3128 (class 2604 OID 16401)
-- Name: pasajeros id; Type: DEFAULT; Schema: public; Owner: usr_taxi24
--

ALTER TABLE ONLY public.pasajeros ALTER COLUMN id SET DEFAULT nextval('public.pasajero_id_seq'::regclass);


--
-- TOC entry 3129 (class 2604 OID 16417)
-- Name: viajes id; Type: DEFAULT; Schema: public; Owner: usr_taxi24
--

ALTER TABLE ONLY public.viajes ALTER COLUMN id SET DEFAULT nextval('public.viajes_id_seq'::regclass);


--
-- TOC entry 3269 (class 0 OID 16390)
-- Dependencies: 201
-- Data for Name: conductores; Type: TABLE DATA; Schema: public; Owner: usr_taxi24
--

COPY public.conductores (id, nombre, paterno, materno, celular, disponibilidad, ubicacion) FROM stdin;
2	ANA	MORGADO	LIRA	2831311841	t	51
1	JAMIL	ENRIQUEZ	DECEANO\n	2838748284	t	48
\.


--
-- TOC entry 3271 (class 0 OID 16398)
-- Dependencies: 203
-- Data for Name: pasajeros; Type: TABLE DATA; Schema: public; Owner: usr_taxi24
--

COPY public.pasajeros (id, nombre, paterno, materno, celular, ubicacion) FROM stdin;
1	Pasajero 1	Paterno 1	Materno 1	2831059191	50
2	Pasajero 2	Paterno 2	Materno 2	2831059292	49
3	Pasajero 3	Paterno 2	Materno 2	2831959393	48
\.


--
-- TOC entry 3273 (class 0 OID 16414)
-- Dependencies: 205
-- Data for Name: viajes; Type: TABLE DATA; Schema: public; Owner: usr_taxi24
--

COPY public.viajes (id, fecha, hora_inicio, hora_fin, estatus, id_pasajero, id_conductor) FROM stdin;
4	2021-08-14	12:40:00	12:50:00	ACTIVO	1	1
1	2021-08-14	12:00:00	12:20:00	COMPLETADO	1	1
\.


--
-- TOC entry 3282 (class 0 OID 0)
-- Dependencies: 200
-- Name: conductores_id_seq; Type: SEQUENCE SET; Schema: public; Owner: usr_taxi24
--

SELECT pg_catalog.setval('public.conductores_id_seq', 2, true);


--
-- TOC entry 3283 (class 0 OID 0)
-- Dependencies: 202
-- Name: pasajero_id_seq; Type: SEQUENCE SET; Schema: public; Owner: usr_taxi24
--

SELECT pg_catalog.setval('public.pasajero_id_seq', 3, true);


--
-- TOC entry 3284 (class 0 OID 0)
-- Dependencies: 204
-- Name: viajes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: usr_taxi24
--

SELECT pg_catalog.setval('public.viajes_id_seq', 4, true);


--
-- TOC entry 3131 (class 2606 OID 16395)
-- Name: conductores conductores_pkey; Type: CONSTRAINT; Schema: public; Owner: usr_taxi24
--

ALTER TABLE ONLY public.conductores
    ADD CONSTRAINT conductores_pkey PRIMARY KEY (id);


--
-- TOC entry 3133 (class 2606 OID 16403)
-- Name: pasajeros pasajero_pkey; Type: CONSTRAINT; Schema: public; Owner: usr_taxi24
--

ALTER TABLE ONLY public.pasajeros
    ADD CONSTRAINT pasajero_pkey PRIMARY KEY (id);


--
-- TOC entry 3135 (class 2606 OID 16419)
-- Name: viajes viajes_pkey; Type: CONSTRAINT; Schema: public; Owner: usr_taxi24
--

ALTER TABLE ONLY public.viajes
    ADD CONSTRAINT viajes_pkey PRIMARY KEY (id);


--
-- TOC entry 3137 (class 2606 OID 16425)
-- Name: viajes viajes_id_conductor_fkey; Type: FK CONSTRAINT; Schema: public; Owner: usr_taxi24
--

ALTER TABLE ONLY public.viajes
    ADD CONSTRAINT viajes_id_conductor_fkey FOREIGN KEY (id_conductor) REFERENCES public.conductores(id);


--
-- TOC entry 3136 (class 2606 OID 16420)
-- Name: viajes viajes_id_pasajero_fkey; Type: FK CONSTRAINT; Schema: public; Owner: usr_taxi24
--

ALTER TABLE ONLY public.viajes
    ADD CONSTRAINT viajes_id_pasajero_fkey FOREIGN KEY (id_pasajero) REFERENCES public.pasajeros(id);


-- Completed on 2021-08-14 01:45:23 CDT

--
-- PostgreSQL database dump complete
--

