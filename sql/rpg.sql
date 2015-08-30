-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 30-Ago-2015 às 18:40
-- Versão do servidor: 5.6.21
-- PHP Version: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `rpg`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_agendamento_campanha`
--

CREATE TABLE IF NOT EXISTS `tb_agendamento_campanha` (
`id_agendamento_campanha` int(11) NOT NULL,
  `data_agendamento` varchar(255) DEFAULT NULL,
  `id_campanha` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_campanha_usuario`
--

CREATE TABLE IF NOT EXISTS `tb_associa_campanha_usuario` (
`id_associa_campanha_usuario` int(11) NOT NULL,
  `status` char(1) DEFAULT NULL,
  `id_campanha` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_efeito_desvantagem`
--

CREATE TABLE IF NOT EXISTS `tb_associa_efeito_desvantagem` (
`id_associa_efeito_desvantagem` int(11) NOT NULL,
  `id_desvantagem` int(11) DEFAULT NULL,
  `id_efeito` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_efeito_item`
--

CREATE TABLE IF NOT EXISTS `tb_associa_efeito_item` (
`id_associa_efeito_item` int(11) NOT NULL,
  `id_efeito` int(11) DEFAULT NULL,
  `id_item` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_efeito_magia`
--

CREATE TABLE IF NOT EXISTS `tb_associa_efeito_magia` (
`id_associa_efeito_magia` int(11) NOT NULL,
  `id_efeito` int(11) DEFAULT NULL,
  `id_magia` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_efeito_vantagem`
--

CREATE TABLE IF NOT EXISTS `tb_associa_efeito_vantagem` (
`id_associa_efeito_vantagem` int(11) NOT NULL,
  `id_efeito` int(11) DEFAULT NULL,
  `id_vantagem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_personagem_atributo`
--

CREATE TABLE IF NOT EXISTS `tb_associa_personagem_atributo` (
`id_associa_personagem_atributo` int(11) NOT NULL,
  `valor` int(11) DEFAULT NULL,
  `id_atributo` int(11) DEFAULT NULL,
  `id_personagem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_personagem_cabecalho_ficha`
--

CREATE TABLE IF NOT EXISTS `tb_associa_personagem_cabecalho_ficha` (
`id_associa_personagem_cabecalho_ficha` int(11) NOT NULL,
  `valor` varchar(255) DEFAULT NULL,
  `id_cabecalho_ficha` int(11) DEFAULT NULL,
  `id_personagem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_personagem_classe`
--

CREATE TABLE IF NOT EXISTS `tb_associa_personagem_classe` (
`id_associa_personagem_classe` int(11) NOT NULL,
  `id_classe` int(11) DEFAULT NULL,
  `id_personagem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_personagem_desvantagem`
--

CREATE TABLE IF NOT EXISTS `tb_associa_personagem_desvantagem` (
`id_associa_personagem_desvantagem` int(11) NOT NULL,
  `id_desvantagem` int(11) DEFAULT NULL,
  `id_personagem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_personagem_magia`
--

CREATE TABLE IF NOT EXISTS `tb_associa_personagem_magia` (
`id_associa_personagem_classe` int(11) NOT NULL,
  `id_magia` int(11) DEFAULT NULL,
  `id_personagem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_personagem_pericia`
--

CREATE TABLE IF NOT EXISTS `tb_associa_personagem_pericia` (
`id_associa_personagem_classe` int(11) NOT NULL,
  `valor` int(11) DEFAULT NULL,
  `id_pericia` int(11) DEFAULT NULL,
  `id_personagem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_personagem_profissao`
--

CREATE TABLE IF NOT EXISTS `tb_associa_personagem_profissao` (
`id_associa_personagem_profissao` int(11) NOT NULL,
  `nivel` int(11) DEFAULT NULL,
  `id_personagem` int(11) DEFAULT NULL,
  `id_pericia` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_personagem_raca`
--

CREATE TABLE IF NOT EXISTS `tb_associa_personagem_raca` (
`id_associa_personagem_classe` int(11) NOT NULL,
  `id_personagem` int(11) DEFAULT NULL,
  `id_raca` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_associa_personagem_vantagem`
--

CREATE TABLE IF NOT EXISTS `tb_associa_personagem_vantagem` (
`id_associa_personagem_vantagem` int(11) NOT NULL,
  `id_personagem` int(11) DEFAULT NULL,
  `id_vantagem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_atributo`
--

CREATE TABLE IF NOT EXISTS `tb_atributo` (
`id_atributo` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL,
  `ordem` int(11) DEFAULT NULL,
  `sigla` varchar(255) DEFAULT NULL,
  `cadastro_manual` bit(1) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_atributo`
--

INSERT INTO `tb_atributo` (`id_atributo`, `descricao`, `flag_ativo`, `nome`, `id_sistema`, `ordem`, `sigla`, `cadastro_manual`) VALUES
(6, 'HABILIDADE', b'1', 'HAB', 1, 1, 'HAB', b'0'),
(7, 'FORTIDUDE', b'1', 'FOR', 1, 2, 'FOR', b'1'),
(8, 'VONTADE', b'1', 'VON', 1, 3, 'VON', b'1'),
(9, 'REFLEXO', b'1', 'REF', 1, 4, 'REF', b'1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_cabecalho_ficha`
--

CREATE TABLE IF NOT EXISTS `tb_cabecalho_ficha` (
`id_cabecalho_ficha` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL,
  `ordem` int(11) DEFAULT NULL,
  `cadastro_manual` bit(1) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_cabecalho_ficha`
--

INSERT INTO `tb_cabecalho_ficha` (`id_cabecalho_ficha`, `descricao`, `flag_ativo`, `nome`, `id_sistema`, `ordem`, `cadastro_manual`) VALUES
(4, 'RACA', b'1', 'RACA', 1, 2, b'1'),
(6, 'CLASSE', b'1', 'CLASSE', 1, 3, b'1'),
(7, 'TENDENCIA', b'1', 'TENDENCIA', 1, 4, b'1'),
(8, 'DIVINDADE', b'1', 'DIVINDADE', 1, 5, b'1'),
(9, 'NIVEL', b'0', 'NIVEL', 1, NULL, b'0'),
(10, 'TAMANHO', b'1', 'TAMANHO', 1, 6, b'1'),
(11, 'IDADE', b'1', 'IDADE', 1, 7, b'1'),
(12, 'SEXO', b'1', 'SEXO', 1, 8, b'1'),
(13, 'ALTURA', b'1', 'ALTURA', 1, 9, b'1'),
(14, 'PESO', b'1', 'PESO', 1, 10, b'1'),
(15, 'OLHOS', b'1', 'OLHOS', 1, 11, b'1'),
(16, 'CABELO', b'1', 'CABELO', 1, 12, b'1'),
(17, 'DINHEIRO', b'1', 'DINHEIRO', 1, NULL, b'0'),
(18, 'EXPERIENCIA', b'1', 'EXPERIENCIA', 1, NULL, b'0'),
(19, 'NIVEL', b'1', 'NIVEL', 1, NULL, b'0'),
(20, 'NOME', b'1', 'NOME', 1, 1, b'1'),
(21, 'TOTAL_EXPERIENCIA', b'1', 'TOTAL_EXPERIENCIA', 1, NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_campanha`
--

CREATE TABLE IF NOT EXISTS `tb_campanha` (
`id_campanha` int(11) NOT NULL,
  `data_criacao` varchar(255) DEFAULT NULL,
  `data_frim` varchar(255) DEFAULT NULL,
  `data_inicio` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `historia` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `id_usuario_mestre` int(11) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_circulo_magico`
--

CREATE TABLE IF NOT EXISTS `tb_circulo_magico` (
`id_circulo_magico` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_classe`
--

CREATE TABLE IF NOT EXISTS `tb_classe` (
`id_classe` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `pre_requisito` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_combate`
--

CREATE TABLE IF NOT EXISTS `tb_combate` (
`id_combate` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_desvantagem`
--

CREATE TABLE IF NOT EXISTS `tb_desvantagem` (
`id_desvantagem` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_desvantagem`
--

INSERT INTO `tb_desvantagem` (`id_desvantagem`, `descricao`, `flag_ativo`, `nome`, `id_sistema`) VALUES
(1, 'Parte do corpo a mais ou a menos', b'1', 'Modelo Especial', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_efeito`
--

CREATE TABLE IF NOT EXISTS `tb_efeito` (
`id_efeito` int(11) NOT NULL,
  `alcance` varchar(255) DEFAULT NULL,
  `atributo` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `duracao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `foco` char(1) DEFAULT NULL,
  `gasto` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `valor` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_equipamento_combate`
--

CREATE TABLE IF NOT EXISTS `tb_equipamento_combate` (
`id_equipamento_combate` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_informacao_login`
--

CREATE TABLE IF NOT EXISTS `tb_informacao_login` (
`id_informacao_login` int(11) NOT NULL,
  `cod_sessao` varchar(255) DEFAULT NULL,
  `dt_login` datetime DEFAULT NULL,
  `dt_logout` datetime DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_item`
--

CREATE TABLE IF NOT EXISTS `tb_item` (
`id_item` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `tipo_item` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_magia`
--

CREATE TABLE IF NOT EXISTS `tb_magia` (
`id_magia` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nivel` int(11) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `pre_requisito` varchar(255) DEFAULT NULL,
  `tipo_magia` varchar(255) DEFAULT NULL,
  `id_circulo_magico` int(11) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_monstro`
--

CREATE TABLE IF NOT EXISTS `tb_monstro` (
`id_monstro` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_pericia`
--

CREATE TABLE IF NOT EXISTS `tb_pericia` (
`id_pericia` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_personagem`
--

CREATE TABLE IF NOT EXISTS `tb_personagem` (
`id_personagem` int(11) NOT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `id_campanha` int(11) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_profissao`
--

CREATE TABLE IF NOT EXISTS `tb_profissao` (
`id_profissao` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_raca`
--

CREATE TABLE IF NOT EXISTS `tb_raca` (
`id_raca` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `pre_requisito` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_regra_sistema`
--

CREATE TABLE IF NOT EXISTS `tb_regra_sistema` (
`id_regra_sistema` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `valor` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_sistema`
--

CREATE TABLE IF NOT EXISTS `tb_sistema` (
`id_sistema` int(11) NOT NULL,
  `data_alteracao` varchar(255) DEFAULT NULL,
  `data_criacao` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_sistema`
--

INSERT INTO `tb_sistema` (`id_sistema`, `data_alteracao`, `data_criacao`, `descricao`, `flag_ativo`, `nome`) VALUES
(1, NULL, '2015-08-29 09:15:39', 'Sistema para testes', b'1', 'Sistema Teste');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_usuario`
--

CREATE TABLE IF NOT EXISTS `tb_usuario` (
`id_usuario` int(11) NOT NULL,
  `apelido` varchar(255) DEFAULT NULL,
  `data_alteracao` varchar(255) DEFAULT NULL,
  `data_criacao` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `status_jogador` char(1) DEFAULT NULL,
  `status_mestre` char(1) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_usuario`
--

INSERT INTO `tb_usuario` (`id_usuario`, `apelido`, `data_alteracao`, `data_criacao`, `email`, `flag_ativo`, `login`, `nome`, `senha`, `status`, `status_jogador`, `status_mestre`) VALUES
(1, 'teste', NULL, '2015-08-29 09:12:27', 'teste', b'1', 'admin', 'teste', '1234', NULL, 'I', 'I');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_vantagem`
--

CREATE TABLE IF NOT EXISTS `tb_vantagem` (
`id_vantagem` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `flag_ativo` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `pre_requisito` varchar(255) DEFAULT NULL,
  `id_sistema` int(11) DEFAULT NULL,
  `nivel` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_vantagem`
--

INSERT INTO `tb_vantagem` (`id_vantagem`, `descricao`, `flag_ativo`, `nome`, `pre_requisito`, `id_sistema`, `nivel`) VALUES
(2, 'Dobra o movimento do personagem', b'1', 'Aceleração', NULL, 1, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_agendamento_campanha`
--
ALTER TABLE `tb_agendamento_campanha`
 ADD PRIMARY KEY (`id_agendamento_campanha`), ADD KEY `FK_5ey7g0ns4q4uysdd866atimnt` (`id_campanha`);

--
-- Indexes for table `tb_associa_campanha_usuario`
--
ALTER TABLE `tb_associa_campanha_usuario`
 ADD PRIMARY KEY (`id_associa_campanha_usuario`), ADD KEY `FK_osjxaeunlm6c44rwghg484928` (`id_campanha`), ADD KEY `FK_ct16aqtg6oxia13sgmcue92ku` (`id_usuario`);

--
-- Indexes for table `tb_associa_efeito_desvantagem`
--
ALTER TABLE `tb_associa_efeito_desvantagem`
 ADD PRIMARY KEY (`id_associa_efeito_desvantagem`), ADD KEY `FK_chls9k9cxo1q5fjgajvgkcvlh` (`id_desvantagem`), ADD KEY `FK_gi7dqqvlbo4vd0c5u4b8ity8t` (`id_efeito`);

--
-- Indexes for table `tb_associa_efeito_item`
--
ALTER TABLE `tb_associa_efeito_item`
 ADD PRIMARY KEY (`id_associa_efeito_item`), ADD KEY `FK_gwg1yospv3l1e7hioebur3tt5` (`id_efeito`), ADD KEY `FK_q8p2uvy7vigsiutuf7qpc34m3` (`id_item`);

--
-- Indexes for table `tb_associa_efeito_magia`
--
ALTER TABLE `tb_associa_efeito_magia`
 ADD PRIMARY KEY (`id_associa_efeito_magia`), ADD KEY `FK_5ql4k7b3u1ghifibvqboe019y` (`id_efeito`), ADD KEY `FK_svlmwor31vsm7r9734cwawma9` (`id_magia`);

--
-- Indexes for table `tb_associa_efeito_vantagem`
--
ALTER TABLE `tb_associa_efeito_vantagem`
 ADD PRIMARY KEY (`id_associa_efeito_vantagem`), ADD KEY `FK_orati6jo6n3riiofpepnwj1wo` (`id_efeito`), ADD KEY `FK_ow3695r57uq6aunay1wmkxc4m` (`id_vantagem`);

--
-- Indexes for table `tb_associa_personagem_atributo`
--
ALTER TABLE `tb_associa_personagem_atributo`
 ADD PRIMARY KEY (`id_associa_personagem_atributo`), ADD KEY `FK_tfbn3l4xnfuicbxhkq5b1qnig` (`id_atributo`), ADD KEY `FK_m8rfr1fkmi5u0ekey6lrasi8b` (`id_personagem`);

--
-- Indexes for table `tb_associa_personagem_cabecalho_ficha`
--
ALTER TABLE `tb_associa_personagem_cabecalho_ficha`
 ADD PRIMARY KEY (`id_associa_personagem_cabecalho_ficha`), ADD KEY `FK_3bnmd9y6n0y5kh2ntymf15oi1` (`id_cabecalho_ficha`), ADD KEY `FK_hsrq85dh78tqpl6tybhkbg711` (`id_personagem`);

--
-- Indexes for table `tb_associa_personagem_classe`
--
ALTER TABLE `tb_associa_personagem_classe`
 ADD PRIMARY KEY (`id_associa_personagem_classe`), ADD KEY `FK_khwr2fs99d6efa456vot99hwo` (`id_classe`), ADD KEY `FK_he4pneishn2wsso9m63mvtply` (`id_personagem`);

--
-- Indexes for table `tb_associa_personagem_desvantagem`
--
ALTER TABLE `tb_associa_personagem_desvantagem`
 ADD PRIMARY KEY (`id_associa_personagem_desvantagem`), ADD KEY `FK_frbn0m31n3nvwsf8x4e7c4d29` (`id_desvantagem`), ADD KEY `FK_6emwl0e6hdtl44bgnx3linub1` (`id_personagem`);

--
-- Indexes for table `tb_associa_personagem_magia`
--
ALTER TABLE `tb_associa_personagem_magia`
 ADD PRIMARY KEY (`id_associa_personagem_classe`), ADD KEY `FK_c6l7ld0fbtdol1yk9xdjb13pv` (`id_magia`), ADD KEY `FK_sj3ytnrej5gu47h7pxtp4qf7g` (`id_personagem`);

--
-- Indexes for table `tb_associa_personagem_pericia`
--
ALTER TABLE `tb_associa_personagem_pericia`
 ADD PRIMARY KEY (`id_associa_personagem_classe`), ADD KEY `FK_6q0d3ydmym3ofo5glcgvfbbg9` (`id_pericia`), ADD KEY `FK_sl17fwm4jkwg45qvoscrdxto8` (`id_personagem`);

--
-- Indexes for table `tb_associa_personagem_profissao`
--
ALTER TABLE `tb_associa_personagem_profissao`
 ADD PRIMARY KEY (`id_associa_personagem_profissao`), ADD KEY `FK_3xfru4idyuyj43wwdavtngypy` (`id_personagem`), ADD KEY `FK_1ybeqfa13puswfbneml0gjsmr` (`id_pericia`);

--
-- Indexes for table `tb_associa_personagem_raca`
--
ALTER TABLE `tb_associa_personagem_raca`
 ADD PRIMARY KEY (`id_associa_personagem_classe`), ADD KEY `FK_ow2klc6v0toll5s98o44xmlh3` (`id_personagem`), ADD KEY `FK_cptqsk9n2frkmdrxht20elbaw` (`id_raca`);

--
-- Indexes for table `tb_associa_personagem_vantagem`
--
ALTER TABLE `tb_associa_personagem_vantagem`
 ADD PRIMARY KEY (`id_associa_personagem_vantagem`), ADD KEY `FK_qlv5sjwt7pfs1dxm16uhloyx0` (`id_personagem`), ADD KEY `FK_37b4kygbkdyufanit0dfj6q3f` (`id_vantagem`);

--
-- Indexes for table `tb_atributo`
--
ALTER TABLE `tb_atributo`
 ADD PRIMARY KEY (`id_atributo`), ADD KEY `FK_cu9txhytu56832i24el1jgrx4` (`id_sistema`);

--
-- Indexes for table `tb_cabecalho_ficha`
--
ALTER TABLE `tb_cabecalho_ficha`
 ADD PRIMARY KEY (`id_cabecalho_ficha`), ADD KEY `FK_lyvpkcgysqkkwn9lg81spf354` (`id_sistema`);

--
-- Indexes for table `tb_campanha`
--
ALTER TABLE `tb_campanha`
 ADD PRIMARY KEY (`id_campanha`), ADD KEY `FK_elu3yngmv1bfmpnm6krynohkr` (`id_usuario_mestre`), ADD KEY `FK_8locu104lh7mbmy1lxy1p49ng` (`id_sistema`);

--
-- Indexes for table `tb_circulo_magico`
--
ALTER TABLE `tb_circulo_magico`
 ADD PRIMARY KEY (`id_circulo_magico`), ADD KEY `FK_pyeea8ve5mkmd08tkvrobdnh5` (`id_sistema`);

--
-- Indexes for table `tb_classe`
--
ALTER TABLE `tb_classe`
 ADD PRIMARY KEY (`id_classe`), ADD KEY `FK_foybx9btq4mtli3scgnbb5kr1` (`id_sistema`);

--
-- Indexes for table `tb_combate`
--
ALTER TABLE `tb_combate`
 ADD PRIMARY KEY (`id_combate`), ADD KEY `FK_2bavgkkh50y5o08tv47ymaj1l` (`id_sistema`);

--
-- Indexes for table `tb_desvantagem`
--
ALTER TABLE `tb_desvantagem`
 ADD PRIMARY KEY (`id_desvantagem`), ADD KEY `FK_p2vtmvdo2lfobakpyewbydniv` (`id_sistema`);

--
-- Indexes for table `tb_efeito`
--
ALTER TABLE `tb_efeito`
 ADD PRIMARY KEY (`id_efeito`), ADD KEY `FK_fr1f69bdtapmk0cd1sags7r88` (`id_sistema`);

--
-- Indexes for table `tb_equipamento_combate`
--
ALTER TABLE `tb_equipamento_combate`
 ADD PRIMARY KEY (`id_equipamento_combate`), ADD KEY `FK_avyv5mamj8e7iqxa12gjv6i5h` (`id_sistema`);

--
-- Indexes for table `tb_informacao_login`
--
ALTER TABLE `tb_informacao_login`
 ADD PRIMARY KEY (`id_informacao_login`), ADD KEY `FK_oacb1s79kx83imdm093iir5q9` (`id_usuario`);

--
-- Indexes for table `tb_item`
--
ALTER TABLE `tb_item`
 ADD PRIMARY KEY (`id_item`), ADD KEY `FK_5oc9vfnwewm524okpt6jm3j9l` (`id_sistema`);

--
-- Indexes for table `tb_magia`
--
ALTER TABLE `tb_magia`
 ADD PRIMARY KEY (`id_magia`), ADD KEY `FK_4p71vlaahqi2huc7mjk4wp47q` (`id_circulo_magico`), ADD KEY `FK_oiaomao916x24o7cbyk0bvnyk` (`id_sistema`);

--
-- Indexes for table `tb_monstro`
--
ALTER TABLE `tb_monstro`
 ADD PRIMARY KEY (`id_monstro`), ADD KEY `FK_92djfxjyyouq2di3rycboexnm` (`id_sistema`);

--
-- Indexes for table `tb_pericia`
--
ALTER TABLE `tb_pericia`
 ADD PRIMARY KEY (`id_pericia`), ADD KEY `FK_5u7vm0no4exrnixwtdy2wnchy` (`id_sistema`);

--
-- Indexes for table `tb_personagem`
--
ALTER TABLE `tb_personagem`
 ADD PRIMARY KEY (`id_personagem`), ADD KEY `FK_s8rftfm78gl7c0rx535tkog8l` (`id_campanha`), ADD KEY `FK_e7or97puuaimhcx8km4wfbem1` (`id_sistema`), ADD KEY `FK_rrc35qh37g1pj56gt6ph7wveh` (`id_usuario`);

--
-- Indexes for table `tb_profissao`
--
ALTER TABLE `tb_profissao`
 ADD PRIMARY KEY (`id_profissao`), ADD KEY `FK_rjqf9hulln5lq7uxjkrnx6ljh` (`id_sistema`);

--
-- Indexes for table `tb_raca`
--
ALTER TABLE `tb_raca`
 ADD PRIMARY KEY (`id_raca`), ADD KEY `FK_f74a3vdobv9rdhmvwie4p9m4t` (`id_sistema`);

--
-- Indexes for table `tb_regra_sistema`
--
ALTER TABLE `tb_regra_sistema`
 ADD PRIMARY KEY (`id_regra_sistema`), ADD KEY `FK_qtqb2can9y18uh090ppeewslq` (`id_sistema`);

--
-- Indexes for table `tb_sistema`
--
ALTER TABLE `tb_sistema`
 ADD PRIMARY KEY (`id_sistema`);

--
-- Indexes for table `tb_usuario`
--
ALTER TABLE `tb_usuario`
 ADD PRIMARY KEY (`id_usuario`);

--
-- Indexes for table `tb_vantagem`
--
ALTER TABLE `tb_vantagem`
 ADD PRIMARY KEY (`id_vantagem`), ADD KEY `FK_3u6jwwn3qqm3rt1bu18ppo72b` (`id_sistema`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_agendamento_campanha`
--
ALTER TABLE `tb_agendamento_campanha`
MODIFY `id_agendamento_campanha` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_campanha_usuario`
--
ALTER TABLE `tb_associa_campanha_usuario`
MODIFY `id_associa_campanha_usuario` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_efeito_desvantagem`
--
ALTER TABLE `tb_associa_efeito_desvantagem`
MODIFY `id_associa_efeito_desvantagem` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_efeito_item`
--
ALTER TABLE `tb_associa_efeito_item`
MODIFY `id_associa_efeito_item` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_efeito_magia`
--
ALTER TABLE `tb_associa_efeito_magia`
MODIFY `id_associa_efeito_magia` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_efeito_vantagem`
--
ALTER TABLE `tb_associa_efeito_vantagem`
MODIFY `id_associa_efeito_vantagem` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_personagem_atributo`
--
ALTER TABLE `tb_associa_personagem_atributo`
MODIFY `id_associa_personagem_atributo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_personagem_cabecalho_ficha`
--
ALTER TABLE `tb_associa_personagem_cabecalho_ficha`
MODIFY `id_associa_personagem_cabecalho_ficha` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_personagem_classe`
--
ALTER TABLE `tb_associa_personagem_classe`
MODIFY `id_associa_personagem_classe` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_personagem_desvantagem`
--
ALTER TABLE `tb_associa_personagem_desvantagem`
MODIFY `id_associa_personagem_desvantagem` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_personagem_magia`
--
ALTER TABLE `tb_associa_personagem_magia`
MODIFY `id_associa_personagem_classe` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_personagem_pericia`
--
ALTER TABLE `tb_associa_personagem_pericia`
MODIFY `id_associa_personagem_classe` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_personagem_profissao`
--
ALTER TABLE `tb_associa_personagem_profissao`
MODIFY `id_associa_personagem_profissao` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_personagem_raca`
--
ALTER TABLE `tb_associa_personagem_raca`
MODIFY `id_associa_personagem_classe` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_associa_personagem_vantagem`
--
ALTER TABLE `tb_associa_personagem_vantagem`
MODIFY `id_associa_personagem_vantagem` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_atributo`
--
ALTER TABLE `tb_atributo`
MODIFY `id_atributo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `tb_cabecalho_ficha`
--
ALTER TABLE `tb_cabecalho_ficha`
MODIFY `id_cabecalho_ficha` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=22;
--
-- AUTO_INCREMENT for table `tb_campanha`
--
ALTER TABLE `tb_campanha`
MODIFY `id_campanha` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_circulo_magico`
--
ALTER TABLE `tb_circulo_magico`
MODIFY `id_circulo_magico` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_classe`
--
ALTER TABLE `tb_classe`
MODIFY `id_classe` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_combate`
--
ALTER TABLE `tb_combate`
MODIFY `id_combate` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_desvantagem`
--
ALTER TABLE `tb_desvantagem`
MODIFY `id_desvantagem` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tb_efeito`
--
ALTER TABLE `tb_efeito`
MODIFY `id_efeito` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_equipamento_combate`
--
ALTER TABLE `tb_equipamento_combate`
MODIFY `id_equipamento_combate` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_informacao_login`
--
ALTER TABLE `tb_informacao_login`
MODIFY `id_informacao_login` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_item`
--
ALTER TABLE `tb_item`
MODIFY `id_item` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_magia`
--
ALTER TABLE `tb_magia`
MODIFY `id_magia` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_monstro`
--
ALTER TABLE `tb_monstro`
MODIFY `id_monstro` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_pericia`
--
ALTER TABLE `tb_pericia`
MODIFY `id_pericia` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_personagem`
--
ALTER TABLE `tb_personagem`
MODIFY `id_personagem` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_profissao`
--
ALTER TABLE `tb_profissao`
MODIFY `id_profissao` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_raca`
--
ALTER TABLE `tb_raca`
MODIFY `id_raca` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_regra_sistema`
--
ALTER TABLE `tb_regra_sistema`
MODIFY `id_regra_sistema` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_sistema`
--
ALTER TABLE `tb_sistema`
MODIFY `id_sistema` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tb_usuario`
--
ALTER TABLE `tb_usuario`
MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tb_vantagem`
--
ALTER TABLE `tb_vantagem`
MODIFY `id_vantagem` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `tb_agendamento_campanha`
--
ALTER TABLE `tb_agendamento_campanha`
ADD CONSTRAINT `FK_5ey7g0ns4q4uysdd866atimnt` FOREIGN KEY (`id_campanha`) REFERENCES `tb_campanha` (`id_campanha`);

--
-- Limitadores para a tabela `tb_associa_campanha_usuario`
--
ALTER TABLE `tb_associa_campanha_usuario`
ADD CONSTRAINT `FK_ct16aqtg6oxia13sgmcue92ku` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuario` (`id_usuario`),
ADD CONSTRAINT `FK_osjxaeunlm6c44rwghg484928` FOREIGN KEY (`id_campanha`) REFERENCES `tb_campanha` (`id_campanha`);

--
-- Limitadores para a tabela `tb_associa_efeito_desvantagem`
--
ALTER TABLE `tb_associa_efeito_desvantagem`
ADD CONSTRAINT `FK_chls9k9cxo1q5fjgajvgkcvlh` FOREIGN KEY (`id_desvantagem`) REFERENCES `tb_desvantagem` (`id_desvantagem`),
ADD CONSTRAINT `FK_gi7dqqvlbo4vd0c5u4b8ity8t` FOREIGN KEY (`id_efeito`) REFERENCES `tb_efeito` (`id_efeito`);

--
-- Limitadores para a tabela `tb_associa_efeito_item`
--
ALTER TABLE `tb_associa_efeito_item`
ADD CONSTRAINT `FK_gwg1yospv3l1e7hioebur3tt5` FOREIGN KEY (`id_efeito`) REFERENCES `tb_efeito` (`id_efeito`),
ADD CONSTRAINT `FK_q8p2uvy7vigsiutuf7qpc34m3` FOREIGN KEY (`id_item`) REFERENCES `tb_item` (`id_item`);

--
-- Limitadores para a tabela `tb_associa_efeito_magia`
--
ALTER TABLE `tb_associa_efeito_magia`
ADD CONSTRAINT `FK_5ql4k7b3u1ghifibvqboe019y` FOREIGN KEY (`id_efeito`) REFERENCES `tb_efeito` (`id_efeito`),
ADD CONSTRAINT `FK_svlmwor31vsm7r9734cwawma9` FOREIGN KEY (`id_magia`) REFERENCES `tb_magia` (`id_magia`);

--
-- Limitadores para a tabela `tb_associa_efeito_vantagem`
--
ALTER TABLE `tb_associa_efeito_vantagem`
ADD CONSTRAINT `FK_orati6jo6n3riiofpepnwj1wo` FOREIGN KEY (`id_efeito`) REFERENCES `tb_efeito` (`id_efeito`),
ADD CONSTRAINT `FK_ow3695r57uq6aunay1wmkxc4m` FOREIGN KEY (`id_vantagem`) REFERENCES `tb_vantagem` (`id_vantagem`);

--
-- Limitadores para a tabela `tb_associa_personagem_atributo`
--
ALTER TABLE `tb_associa_personagem_atributo`
ADD CONSTRAINT `FK_m8rfr1fkmi5u0ekey6lrasi8b` FOREIGN KEY (`id_personagem`) REFERENCES `tb_personagem` (`id_personagem`),
ADD CONSTRAINT `FK_tfbn3l4xnfuicbxhkq5b1qnig` FOREIGN KEY (`id_atributo`) REFERENCES `tb_atributo` (`id_atributo`);

--
-- Limitadores para a tabela `tb_associa_personagem_cabecalho_ficha`
--
ALTER TABLE `tb_associa_personagem_cabecalho_ficha`
ADD CONSTRAINT `FK_3bnmd9y6n0y5kh2ntymf15oi1` FOREIGN KEY (`id_cabecalho_ficha`) REFERENCES `tb_cabecalho_ficha` (`id_cabecalho_ficha`),
ADD CONSTRAINT `FK_hsrq85dh78tqpl6tybhkbg711` FOREIGN KEY (`id_personagem`) REFERENCES `tb_personagem` (`id_personagem`);

--
-- Limitadores para a tabela `tb_associa_personagem_classe`
--
ALTER TABLE `tb_associa_personagem_classe`
ADD CONSTRAINT `FK_he4pneishn2wsso9m63mvtply` FOREIGN KEY (`id_personagem`) REFERENCES `tb_personagem` (`id_personagem`),
ADD CONSTRAINT `FK_khwr2fs99d6efa456vot99hwo` FOREIGN KEY (`id_classe`) REFERENCES `tb_classe` (`id_classe`);

--
-- Limitadores para a tabela `tb_associa_personagem_desvantagem`
--
ALTER TABLE `tb_associa_personagem_desvantagem`
ADD CONSTRAINT `FK_6emwl0e6hdtl44bgnx3linub1` FOREIGN KEY (`id_personagem`) REFERENCES `tb_personagem` (`id_personagem`),
ADD CONSTRAINT `FK_frbn0m31n3nvwsf8x4e7c4d29` FOREIGN KEY (`id_desvantagem`) REFERENCES `tb_desvantagem` (`id_desvantagem`);

--
-- Limitadores para a tabela `tb_associa_personagem_magia`
--
ALTER TABLE `tb_associa_personagem_magia`
ADD CONSTRAINT `FK_c6l7ld0fbtdol1yk9xdjb13pv` FOREIGN KEY (`id_magia`) REFERENCES `tb_magia` (`id_magia`),
ADD CONSTRAINT `FK_sj3ytnrej5gu47h7pxtp4qf7g` FOREIGN KEY (`id_personagem`) REFERENCES `tb_personagem` (`id_personagem`);

--
-- Limitadores para a tabela `tb_associa_personagem_pericia`
--
ALTER TABLE `tb_associa_personagem_pericia`
ADD CONSTRAINT `FK_6q0d3ydmym3ofo5glcgvfbbg9` FOREIGN KEY (`id_pericia`) REFERENCES `tb_pericia` (`id_pericia`),
ADD CONSTRAINT `FK_sl17fwm4jkwg45qvoscrdxto8` FOREIGN KEY (`id_personagem`) REFERENCES `tb_personagem` (`id_personagem`);

--
-- Limitadores para a tabela `tb_associa_personagem_profissao`
--
ALTER TABLE `tb_associa_personagem_profissao`
ADD CONSTRAINT `FK_1ybeqfa13puswfbneml0gjsmr` FOREIGN KEY (`id_pericia`) REFERENCES `tb_profissao` (`id_profissao`),
ADD CONSTRAINT `FK_3xfru4idyuyj43wwdavtngypy` FOREIGN KEY (`id_personagem`) REFERENCES `tb_personagem` (`id_personagem`);

--
-- Limitadores para a tabela `tb_associa_personagem_raca`
--
ALTER TABLE `tb_associa_personagem_raca`
ADD CONSTRAINT `FK_cptqsk9n2frkmdrxht20elbaw` FOREIGN KEY (`id_raca`) REFERENCES `tb_raca` (`id_raca`),
ADD CONSTRAINT `FK_ow2klc6v0toll5s98o44xmlh3` FOREIGN KEY (`id_personagem`) REFERENCES `tb_personagem` (`id_personagem`);

--
-- Limitadores para a tabela `tb_associa_personagem_vantagem`
--
ALTER TABLE `tb_associa_personagem_vantagem`
ADD CONSTRAINT `FK_37b4kygbkdyufanit0dfj6q3f` FOREIGN KEY (`id_vantagem`) REFERENCES `tb_vantagem` (`id_vantagem`),
ADD CONSTRAINT `FK_qlv5sjwt7pfs1dxm16uhloyx0` FOREIGN KEY (`id_personagem`) REFERENCES `tb_personagem` (`id_personagem`);

--
-- Limitadores para a tabela `tb_atributo`
--
ALTER TABLE `tb_atributo`
ADD CONSTRAINT `FK_cu9txhytu56832i24el1jgrx4` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_cabecalho_ficha`
--
ALTER TABLE `tb_cabecalho_ficha`
ADD CONSTRAINT `FK_lyvpkcgysqkkwn9lg81spf354` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_campanha`
--
ALTER TABLE `tb_campanha`
ADD CONSTRAINT `FK_8locu104lh7mbmy1lxy1p49ng` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`),
ADD CONSTRAINT `FK_elu3yngmv1bfmpnm6krynohkr` FOREIGN KEY (`id_usuario_mestre`) REFERENCES `tb_usuario` (`id_usuario`);

--
-- Limitadores para a tabela `tb_circulo_magico`
--
ALTER TABLE `tb_circulo_magico`
ADD CONSTRAINT `FK_pyeea8ve5mkmd08tkvrobdnh5` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_classe`
--
ALTER TABLE `tb_classe`
ADD CONSTRAINT `FK_foybx9btq4mtli3scgnbb5kr1` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_combate`
--
ALTER TABLE `tb_combate`
ADD CONSTRAINT `FK_2bavgkkh50y5o08tv47ymaj1l` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_desvantagem`
--
ALTER TABLE `tb_desvantagem`
ADD CONSTRAINT `FK_p2vtmvdo2lfobakpyewbydniv` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_efeito`
--
ALTER TABLE `tb_efeito`
ADD CONSTRAINT `FK_fr1f69bdtapmk0cd1sags7r88` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_equipamento_combate`
--
ALTER TABLE `tb_equipamento_combate`
ADD CONSTRAINT `FK_avyv5mamj8e7iqxa12gjv6i5h` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_informacao_login`
--
ALTER TABLE `tb_informacao_login`
ADD CONSTRAINT `FK_oacb1s79kx83imdm093iir5q9` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuario` (`id_usuario`);

--
-- Limitadores para a tabela `tb_item`
--
ALTER TABLE `tb_item`
ADD CONSTRAINT `FK_5oc9vfnwewm524okpt6jm3j9l` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_magia`
--
ALTER TABLE `tb_magia`
ADD CONSTRAINT `FK_4p71vlaahqi2huc7mjk4wp47q` FOREIGN KEY (`id_circulo_magico`) REFERENCES `tb_circulo_magico` (`id_circulo_magico`),
ADD CONSTRAINT `FK_oiaomao916x24o7cbyk0bvnyk` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_monstro`
--
ALTER TABLE `tb_monstro`
ADD CONSTRAINT `FK_92djfxjyyouq2di3rycboexnm` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_pericia`
--
ALTER TABLE `tb_pericia`
ADD CONSTRAINT `FK_5u7vm0no4exrnixwtdy2wnchy` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_personagem`
--
ALTER TABLE `tb_personagem`
ADD CONSTRAINT `FK_e7or97puuaimhcx8km4wfbem1` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`),
ADD CONSTRAINT `FK_rrc35qh37g1pj56gt6ph7wveh` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuario` (`id_usuario`),
ADD CONSTRAINT `FK_s8rftfm78gl7c0rx535tkog8l` FOREIGN KEY (`id_campanha`) REFERENCES `tb_campanha` (`id_campanha`);

--
-- Limitadores para a tabela `tb_profissao`
--
ALTER TABLE `tb_profissao`
ADD CONSTRAINT `FK_rjqf9hulln5lq7uxjkrnx6ljh` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_raca`
--
ALTER TABLE `tb_raca`
ADD CONSTRAINT `FK_f74a3vdobv9rdhmvwie4p9m4t` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_regra_sistema`
--
ALTER TABLE `tb_regra_sistema`
ADD CONSTRAINT `FK_qtqb2can9y18uh090ppeewslq` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

--
-- Limitadores para a tabela `tb_vantagem`
--
ALTER TABLE `tb_vantagem`
ADD CONSTRAINT `FK_3u6jwwn3qqm3rt1bu18ppo72b` FOREIGN KEY (`id_sistema`) REFERENCES `tb_sistema` (`id_sistema`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
