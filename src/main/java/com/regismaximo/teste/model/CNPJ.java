package com.regismaximo.teste.model;

public class CNPJ {

		private String numeroInscricao;
		private String dataAbertura;
		private String nomeEmpresarial;
		private String porte;
		private String nomeFantasia;
		private String atividadePrincipal;
		private String atividadeSecundaria;
		private String descricaoJuridica;
		private String logradouro;
		private int	numero;
		private String complemento;
		private String cep;
		private String bairroDistrito;
		private String municipio;
		private String enderecoEletronico; 
		private String telefone;
		private String enteFederativo;
		private String situacaoCadastral;
		private String dataSituacaoCad;
		private String motivoSituacaoCad;
		private String situacaoEspecial;
		private String dataSituacaoEsp;
		
		public CNPJ() {
		}
		
		public CNPJ(String numeroInscricao, String dataAbertura, String nomeEmpresarial, String porte,
				String nomeFantasia, String atividadePrincipal, String atividadeSecundaria, String descricaoJuridica,
				String logradouro, int numero, String complemento, String cep, String bairroDistrito, String municipio,
				String enderecoEletronico, String telefone, String enteFederativo, String situacaoCadastral,
				String dataSituacaoCad, String motivoSituacaoCad, String situacaoEspecial, String dataSituacaoEsp) {
			
			this.numeroInscricao = numeroInscricao;
			this.dataAbertura = dataAbertura;
			this.nomeEmpresarial = nomeEmpresarial;
			this.porte = porte;
			this.nomeFantasia = nomeFantasia;
			this.atividadePrincipal = atividadePrincipal;
			this.atividadeSecundaria = atividadeSecundaria;
			this.descricaoJuridica = descricaoJuridica;
			this.logradouro = logradouro;
			this.numero = numero;
			this.complemento = complemento;
			this.cep = cep;
			this.bairroDistrito = bairroDistrito;
			this.municipio = municipio;
			this.enderecoEletronico = enderecoEletronico;
			this.telefone = telefone;
			this.enteFederativo = enteFederativo;
			this.situacaoCadastral = situacaoCadastral;
			this.dataSituacaoCad = dataSituacaoCad;
			this.motivoSituacaoCad = motivoSituacaoCad;
			this.situacaoEspecial = situacaoEspecial;
			this.dataSituacaoEsp = dataSituacaoEsp;
		}
		public String getNumeroInscricao() {
			return numeroInscricao;
		}
		public void setNumeroInscricao(String numeroInscricao) {
			this.numeroInscricao = numeroInscricao;
		}
		public String getDataAbertura() {
			return dataAbertura;
		}
		public void setDataAbertura(String dataAbertura) {
			this.dataAbertura = dataAbertura;
		}
		public String getNomeEmpresarial() {
			return nomeEmpresarial;
		}
		public void setNomeEmpresarial(String nomeEmpresarial) {
			this.nomeEmpresarial = nomeEmpresarial;
		}
		public String getPorte() {
			return porte;
		}
		public void setPorte(String porte) {
			this.porte = porte;
		}
		public String getNomeFantasia() {
			return nomeFantasia;
		}
		public void setNomeFantasia(String nomeFantasia) {
			this.nomeFantasia = nomeFantasia;
		}
		public String getAtividadePrincipal() {
			return atividadePrincipal;
		}
		public void setAtividadePrincipal(String atividadePrincipal) {
			this.atividadePrincipal = atividadePrincipal;
		}
		public String getAtividadeSecundaria() {
			return atividadeSecundaria;
		}
		public void setAtividadeSecundaria(String atividadeSecundaria) {
			this.atividadeSecundaria = atividadeSecundaria;
		}
		public String getDescricaoJuridica() {
			return descricaoJuridica;
		}
		public void setDescricaoJuridica(String descricaoJuridica) {
			this.descricaoJuridica = descricaoJuridica;
		}
		public String getLogradouro() {
			return logradouro;
		}
		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getBairroDistrito() {
			return bairroDistrito;
		}
		public void setBairroDistrito(String bairroDistrito) {
			this.bairroDistrito = bairroDistrito;
		}
		public String getMunicipio() {
			return municipio;
		}
		public void setMunicipio(String municipio) {
			this.municipio = municipio;
		}
		public String getEnderecoEletronico() {
			return enderecoEletronico;
		}
		public void setEnderecoEletronico(String enderecoEletronico) {
			this.enderecoEletronico = enderecoEletronico;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEnteFederativo() {
			return enteFederativo;
		}
		public void setEnteFederativo(String enteFederativo) {
			this.enteFederativo = enteFederativo;
		}
		public String getSituacaoCadastral() {
			return situacaoCadastral;
		}
		public void setSituacaoCadastral(String situacaoCadastral) {
			this.situacaoCadastral = situacaoCadastral;
		}
		public String getDataSituacaoCad() {
			return dataSituacaoCad;
		}
		public void setDataSituacaoCad(String dataSituacaoCad) {
			this.dataSituacaoCad = dataSituacaoCad;
		}
		public String getMotivoSituacaoCad() {
			return motivoSituacaoCad;
		}
		public void setMotivoSituacaoCad(String motivoSituacaoCad) {
			this.motivoSituacaoCad = motivoSituacaoCad;
		}
		public String getSituacaoEspecial() {
			return situacaoEspecial;
		}
		public void setSituacaoEspecial(String situacaoEspecial) {
			this.situacaoEspecial = situacaoEspecial;
		}
		public String getDataSituacaoEsp() {
			return dataSituacaoEsp;
		}
		public void setDataSituacaoEsp(String dataSituacaoEsp) {
			this.dataSituacaoEsp = dataSituacaoEsp;
		}

		@Override
		public String toString() {
			return "CNPJ [numeroInscricao=" + numeroInscricao + ", dataAbertura=" + dataAbertura + ", nomeEmpresarial="
					+ nomeEmpresarial + ", porte=" + porte + ", nomeFantasia=" + nomeFantasia + ", atividadePrincipal="
					+ atividadePrincipal + ", atividadeSecundaria=" + atividadeSecundaria + ", descricaoJuridica="
					+ descricaoJuridica + ", logradouro=" + logradouro + ", numero=" + numero + ", complemento="
					+ complemento + ", cep=" + cep + ", bairroDistrito=" + bairroDistrito + ", municipio=" + municipio
					+ ", enderecoEletronico=" + enderecoEletronico + ", telefone=" + telefone + ", enteFederativo="
					+ enteFederativo + ", situacaoCadastral=" + situacaoCadastral + ", dataSituacaoCad="
					+ dataSituacaoCad + ", motivoSituacaoCad=" + motivoSituacaoCad + ", situacaoEspecial="
					+ situacaoEspecial + ", dataSituacaoEsp=" + dataSituacaoEsp + "]";
		}
		
		
		
}
